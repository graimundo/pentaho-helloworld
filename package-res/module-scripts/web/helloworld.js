requirejs.config({

    baseUrl: 'modules',
    
    paths: {
        purchase: 'purchase',
        credits: 'credits',
        products: 'products'
    }
});

require( ["purchase"], function( purchase ) {
  purchase.purchaseProduct();
});