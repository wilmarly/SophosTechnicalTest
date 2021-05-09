 Feature: request for users 
    As a consumer tester, I would like to request for users
  
@UsersRequest
  Scenario Outline: Users request Rest
    
	Given request the users of the page
	|<nombre>|<page>|

	Then I should have code response
	|<code>|
  
  Examples: 
  | idCase | nombre | page | code | 
   ##@externaldata@./src/test/resources/datadriven/RestAssuredData.xlsx@RequestData@1
   |1   |Bot   |3   |200|

   
