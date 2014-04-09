define( ["js/credits", "js/products"], function( credits, products ) {
 
  console.log( "Function : purchaseProduct" );
 
  return {
    purchaseProduct: function() {
 
      var credit = credits.getCredits();
      var resultDiv = document.getElementById("result");

      if ( credit > 0 ) {
        products.reserveProduct();
        resultDiv.innerHTML = "Reserved Product!";
        return true;
      }
      resultDiv.innerHTML = "Product not reserved...";
      return false;
    }
  }
});