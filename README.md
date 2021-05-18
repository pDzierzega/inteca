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

docker-compose up

 
