({
    appDir: "./module-scripts/",
    baseUrl: ".",
    dir: "../bin/scriptOutput",
    optimizeCss: "false",
    mainConfigFile: 'requireCfg.js',
    skipDirOptimize: true,
    modules: [
        {
            name: "output/main",
            include: ["web/helloworld"],
            create: true
        }
    ]
})