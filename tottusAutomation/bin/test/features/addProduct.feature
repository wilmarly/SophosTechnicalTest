Feature: Add product to cart 
    As a consumer user, I would like to be able to add a product to the tottus virtual store

@tottusStore
  Scenario Outline: add a product to the shopping cart
    
	Given The customer is looking for a product in tottus
	|<nombre>|<section>|<product>|
	When the customer adds the product to the cart
	Then The user must see the selected product in the shopping cart
	|<product>|
  
  Examples: 
  | idCase | nombre | section | product | 
   ##@externaldata@./src/test/resources/datadriven/addProductData.xlsx@ProductData@1




   
   

 

   
   
 



