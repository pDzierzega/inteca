This is the evaluation task for job interview. 

To create docker images type: 


	cd .\inteca-customer\
	mvn spring-boot:build-image
	cd ..

	cd .\inteca-product\
	mvn spring-boot:build-image
	cd ..

	cd .\inteca-credit\
	mvn spring-boot:build-image
	cd ..
	
Then, to start containers, type:

	docker-compose up


UC01:
METHOD.POST http://localhost:7070/credits 
HEADERS: Content-Type:application/json
BODY: 


	{
     "credit":
    {
        	"creditName": "creditName example"
    },
    "product":
    {
        "productName": "productName example",
        "value": "123"
    },
     "customer":
    {
        "firstName": "firstName example",
        "surname": "surname example",
		      "pesel": "123"
    }
	}



UC01: METHOD.GET http://localhost:7070/credits 
 
