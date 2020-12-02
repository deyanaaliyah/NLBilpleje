CREATE TABLE IF NOT EXISTS Person (
    "id" INT(100) NOT NULL auto_increment,
    "car_type" VARCHAR(200),
    "first_name" VARCHAR(200),
    "last_name" VARCHAR(200),
    "mail" VARCHAR(200),
    "phone" INT(8),
    PRIMARY KEY ("id"));
CREATE TABLE IF NOT EXISTS Booking(
    "id"            INT(100) NOT NULL auto_increment,
    "addition"      VARCHAR(200),
    "size"          VARCHAR(200),
    "is_cleaned"    VARCHAR(200),
    "license_plate"  VARCHAR(7),
    "person_id"     INT(100),
    PRIMARY KEY ("id"),
    FOREIGN KEY ("person_id")
        REFERENCES Person(id));
CREATE TABLE IF NOT EXISTS Admin(
    "id" INT(100) NOT NULL auto_increment,
    "username" VARCHAR(200),
    "password" VARCHAR(200),
    PRIMARY KEY ("id"));

-- data to be inserted into tables
INSERT INTO Person(car_type,first_name,last_name,mail,phone)
    VALUES ('SUV',      'Per','Johansen',       'perj94@mail.com',      52484800),
           ('Micro',    'Kenneth','Sørensen',   'ksørensen@mail.com',   22842094),
           ('Sedan',    'Sarah','Hansen',       'sarhan@mail.com',      39462038),
           ('Sedan',    'Ditte','Jensen',       'ditjen@mail.com',      29374834),
           ('Micro',    'Noah','Fenster',       'noahf@mail.com',       67354637),
           ('SUV',      'Alexander','Poersmose', 'alpor@mail.com',      22643748),
           ('Micro',    'Louis','Cruton',       'lc@mail.com',          24252501),
           ('Micro',    'Kristian','Deeznuts',  'krisnuts@mail.com',    24348210);

INSERT INTO Booking(addition, size, is_cleaned, license_plate)
    VALUES ('none',     'SUV',      'true',   'CK12345'),
           ('polering', 'Micro',    'false',  'AE10808'),
           ('none',     'Sedan',    'true',   'BM74823'),
           ('hundehår', 'Sedan',    'false',  'CS83239'),
           ('none',     'Micro',    'true',   'DJ20842'),
           ('none',     'SUV',      'true',   'IK39042'),
           ('polering', 'Micro',    'false',  'DI49024'),
           ('none',     'Micro',    'true',   'OO49024');

INSERT INTO Admin(username, password)
    VALUES ('root',     'strongpassword');