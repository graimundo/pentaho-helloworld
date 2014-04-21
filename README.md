pentaho-helloworld
==================

This project is intended to help kick-start new plugin development for the Pentaho platform.

NOTE: this is a **work-in-progress**

Assumptions:
------------

1. Directory Structure (mostly dictated by subfloor files):
    - **build-res**: build resources for both client-side and server-side code
        1. subfloor files (at least subfloor.xml, subfloor.pkg and subfloor-js.xml)
        2. RequireJS optimizer configuration file (javascript.build.js.template)
    - **config**: client-side testing configuration via "karma.ci.conf.js.template"
    - **package-res**: plugin configuration templates and client-side source code
    1. **module-scripts**: client-side source code
        - **js**: client-side app source code
        - **js-tests**: client-side tests source code
        - **lang**: globalization files
        - **launcher-templates**: launcher templates
    - **src**: server-side source code
    - **test-src**: server-side tests source code
    - **build.xml**: Ant build file
    - **build.properties**: project-specific Ant properties
    - **ivy.xml**: Ivy project dependencies
    - **ivysettings.xml**: Ivy configuration
    - **package.json**: client-side dependencies not resolved via Ivy (e.g., Karma)

2. Technology:
    - **Java 6** for server-side code.
    - **JUnit** for server-side code testing.
    - **Karma** and **Jasmine** for client-side tests
    - **RequireJS** for client-side dependency resolution (for both app and tests)
    - Pentaho's **Common-UI** artifact for client-side library dependencies (e.g., RequireJS, jQuery)

3. Architecture:
    - **Client-Side**: TBD
    - **Server-Side**: DDD with SoC and DI.
        1. **domain package**: encapsulates everything related to the plugin's domain model.
            - **model**: contains the domain model definitions for this plugin.
                - **dtos**: DTOs to transport domain entities outside of domain boundaries (e.g., through REST endpoints). Do not use interfaces for DTOs, as these are not supported by JAXB-based serialization via JAX-RS.
                - **entities**: domain entities for this plugin, with respective interfaces.
                - **factories**: factories used to control domain entity creation and ensure DI, with respective interfaces.
            - **services**: domain services that perform domain business logic are located here. Entity-specific business logic should be encapsulated in an entity-specific service, whereas cross-cutting business logic that references several domain entities should be encapsulated in the Root Domain Object, or RDO. The RDO is the only entry point to the domain model, and is therefore responsible for handing out entity-specific domain services to other layers that want to use the domain model. Also, use interfaces instead of concrete implementations when accessing the RDO.

        2. **endpoints package**: contains transport-dependent source code (e.g., REST endpoints) to expose domain model functionality to the outside world. DTOs sould be used here for communication purposes, instead of concrete domain entities.
  
Main Ant targets:
-----------------

1. **mega-dist**: default target, cleans everything and builds a deployment zip to the "dist" directory.
..* alias for "ant super-clean super-dist"

2. **super-clean**: cleans everything
..* alias for "ant clean-all clean-js"

3. **super-dist**: builds deployment zip
..* alias for "ant resolve resolve-js build-js dist"

4. **clean-all**: cleans all artifacts related to server-side code

5. **clean-js**: cleans all artifacts related to client-side code

6. **resolve**: resolve server-side dependencies

7. **resolve-js**: resolve client-side dependencies

8. **test**: run server-side tests

9. **test-js**: run client-side tests

10. **gen-dev-js**: generate client-side app launcher from templates for development-time testing