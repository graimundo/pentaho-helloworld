require( ["purchase", "jquery"], function( purchase, $ ) {
  $( "body" ).append( "HELLO FROM JQUERY!!!!!!" );
  purchase.purchaseProduct();
});