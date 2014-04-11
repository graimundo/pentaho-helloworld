require.config({
	baseUrl: './js',
	paths: {
		jquery: '../../../common-ui/resources/web/jquery/jquery-1.9.1.min'
	}
});

requirejs(["app"]);