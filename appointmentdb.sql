CREATE TABLE appointments (
    id int NOT NULL AUTO_INCREMENT,
    title VARCHAR(255),
    short_description VARCHAR(255),
    date_appointment VARCHAR(20),
    hour VARCHAR(20),
    agent VARCHAR(50),
    propertie int,
    state_appointment VARCHAR(10),
    cellphone int,
    fullname VARCHAR(60),
    email VARCHAR(100),
    PRIMARY KEY (id)
);


INSERT INTO appointments (
    title, 
    short_description, 
    date_appointment, 
    hour, 
    agent, 
    propertie,
    state_appointment,
    cellphone,
    fullname,
    email
)
VALUE (
    "Ir a la casa de Big Smoke",
    "Visitar la casa de Big Smoke en Grove Street. -Solo tenias que segir el tren CJ!-",
    "11/9/2021",
    "8:10:00 PM",
    "Ned Bigby",
    "98723",
    "En Proceso",
    9827398,
    "Aliison Page",
    "alissonPage@gmail.com"
);


INSERT INTO appointments (
    title, 
    short_description, 
    date_appointment, 
    hour, 
    agent, 
    propertie,
    state_appointment,
    cellphone,
    fullname,
    email
)
VALUE (
    "Ir a la casa de Big Smoke",
    "Visitar la casa de Big Smoke en Grove Street. -Solo tenias que segir el tren CJ!-",
    "11/9/2021",
    "8:10:00 PM",
    "Ned Bigby",
    "98723",
    "En Proceso",
    9827398,
    "Melody Banner",
    "melodyBanner@gmail.com"
);


INSERT INTO appointments (
    title, 
    short_description, 
    date_appointment, 
    hour, 
    agent, 
    propertie,
    state_appointment,
    cellphone,
    fullname,
    email
)
VALUE (
    "Ir a la casa de Big Smoke",
    "Visitar la casa de Big Smoke en Grove Street. -Solo tenias que segir el tren CJ!-",
    "11/9/2021",
    "8:10:00 PM",
    "Ned Bigby",
    "98723",
    "En Proceso",
    9827398,
    "Sarah Connor",
    "sarahConnor@gmail.com"
);

INSERT INTO appointments (
    title, 
    short_description, 
    date_appointment, 
    hour, 
    agent, 
    propertie,
    state_appointment,
    cellphone,
    fullname,
    email
)
VALUE (
    "Ir a Pegaho",
    "Manuelita vivia en Peguaho, pero un dia se volvio",
    "11/9/2021",
    "8:10:00 PM",
    "Ned Bigby",
    "98723",
    "En Proceso",
    9827398,
    "Manuelita",
    "manuelita@gmail.com"
);