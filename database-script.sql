CREATE TABLE appointments (
    id int NOT NULL AUTO_INCREMENT,
    title VARCHAR(255),
    short_description VARCHAR(255),
    date_appointment VARCHAR(20),
    hour VARCHAR(20),
    agent VARCHAR(50),
    propertie int,
    id_client int,
    state_appointment VARCHAR(10),
    PRIMARY KEY (id),
    FOREIGN KEY (id_client) REFERENCES clients(id_client)
);

CREATE TABLE clients (
    id_client int NOT NULL AUTO_INCREMENT,
    fullname VARCHAR(60),
    cellphone int,
    email VARCHAR(100),
    PRIMARY KEY (id_client)
);

INSERT INTO appointments (
    title, 
    short_description, 
    date_appointment, 
    hour, 
    agent, 
    propertie,
    id_client,
    state_appointment
)
VALUE (
    "Ir a la casa de Big Smoke",
    "Visitar la casa de Big Smoke en Grove Street. -Solo tenias que segir el tren CJ!-",
    "11/9/2021",
    "8:10:00 PM",
    "Ned Bigby",
    "98723",
    1,
    "En Proceso"
);

INSERT INTO appointments (
    title, 
    short_description, 
    date_appointment, 
    hour, 
    agent, 
    propertie,
    id_client,
    state_appointment
)
VALUE (
    "Visitar la Colmena de Raccon City",
    "Llevar a Alice a conocer la colmena",
    "11/9/2021",
    "9:10:00 PM",
    "Ned Bigby",
    "9823",
    2,
    "En Proceso"
);

INSERT INTO clients (
    fullname,
    cellphone,
    email
)
VALUE (
    "Alice Page",
    234235,
    "alice@gmail.com"
);

INSERT INTO clients (
    fullname,
    cellphone,
    email
)
VALUE (
    "Alisson Page",
    92834,
    "alissonPage@gmail.com"
);



ALTER TABLE appointments
ADD COLUMN client VARCHAR(50) NOT NULL AFTER propertie;

ALTER TABLE appointments
ADD COLUMN cellphone int AFTER client;

ALTER TABLE appointments
ADD COLUMN email VARCHAR(100) AFTER cellphone;