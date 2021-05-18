CREATE TABLE Credit(
                       ID int NOT NULL AUTO_INCREMENT,
                       CreditName VARCHAR(255) NOT NULL ,

                       PRIMARY KEY (ID)
);

CREATE TABLE Product(
                        ID int NOT NULL AUTO_INCREMENT ,
                        CreditID int NOT NULL ,
                        ProductName VARCHAR(255) ,
                        Value VARCHAR(255) ,

                        PRIMARY KEY (ID),
                        UNIQUE (CreditID)
#                         FOREIGN KEY (CreditId) REFERENCES Credit(ID)
);

CREATE TABLE Customer(
                        ID int NOT NULL AUTO_INCREMENT ,
                        CreditID int NOT NULL ,
                        FirstName VARCHAR(255) ,
                        Surname VARCHAR(255) ,
                        Pesel VARCHAR(255) ,

                        PRIMARY KEY (ID),
                        UNIQUE (CreditID)
#                         FOREIGN KEY (CreditId) REFERENCES Credit(ID)
);
