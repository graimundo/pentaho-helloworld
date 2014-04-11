require.config({
	baseUrl: './js',
	paths: {
		jquery: '../../../js-lib/expanded/common-ui/resources/web/jquery/jquery-1.9.1.min'
	}
});

requirejs(["app"]);