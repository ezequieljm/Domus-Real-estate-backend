CREATE TABLE appointments (
    id int NOT NULL AUTO_INCREMENT,
    title VARCHAR(255),
    short_description VARCHAR(255),
    date_appointment VARCHAR(20),
    hour VARCHAR(20),
    agent VARCHAR(50),
    propertie int,
    client VARCHAR(50),
    cellphone int,
    email VARCHAR(100),
    state_appointment VARCHAR(10),
    PRIMARY KEY (id)
);


INSERT INTO appointments (
    title, 
    short_description, 
    date_appointment, 
    hour, 
    agent, 
    propertie,
    client,
    cellphone,
    email,
    state_appointment
)
VALUE (
    "Ir a la casa de Big Smoke",
    "Visitar la casa de Big Smoke en Grove Street. -Solo tenias que segir el tren CJ!-",
    "11/9/2021",
    "8:10:00 PM",
    "Ned Bigby",
    "98723",
    "Jeffrey Winger",
    23423423,
    "jeffWinger@gmail.com",
    "En Proceso"
);


INSERT INTO appointments (
    title, 
    short_description, 
    date_appointment, 
    hour, 
    agent, 
    propertie, 
    client,
    cellphone,
    email,
    state_appointment
)
VALUE (
    "Visitar la Colmena. Laboratorios de Raccon City.",
    "Ir a los laboratorios de Raccon City.",
    "12/8/2021",
    "10:10:00 AM",
    "Gordon Freeman",
    "8723",
    "Anni Edison",
    98793235,
    "anniEdison@gmail.com",
    "Cancelada"
);

INSERT INTO appointments (
    title, 
    short_description, 
    date_appointment, 
    hour, 
    agent, 
    propertie, 
    client,
    cellphone,
    email,
    state_appointment
)
VALUE (
    "Viajar a Ciudad 17.",
    "Ned Bigby tiene que viajar a ver la casa de propietario Gman en ciudad 17.",
    "12/15/2021",
    "12:10:00 AM",
    "Ned Bigby",
    "88993",
    "Britta Perry",
    87687632,
    "brittaPerry@gmail.com",
    "En Proceso"
);


INSERT INTO appointments (
    title, 
    short_description, 
    date_appointment, 
    hour, 
    agent, 
    propertie, 
    client,
    cellphone,
    email,
    state_appointment
)
VALUE (
    "Reunion con Durotan",
    "Charla con el nuevo cliente Durotan Lobogelido",
    "12/10/2021",
    "12:10:00 AM",
    "Richard Feynman",
    "78236",
    "Troy Barnes",
    20152345,
    "troyBarner@gmail.com",
    "Finalizada"
);

ALTER TABLE appointments
ADD COLUMN client VARCHAR(50) NOT NULL AFTER propertie;

ALTER TABLE appointments
ADD COLUMN cellphone int AFTER client;

ALTER TABLE appointments
ADD COLUMN email VARCHAR(100) AFTER cellphone;