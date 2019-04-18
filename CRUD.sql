
-- CRUD for table `editions`

SELECT * FROM periodicals.editions;
INSERT INTO `periodicals`.`editions` (`title`, `cost`) VALUES ('HarryPotter', '25');

UPDATE `periodicals`.`editions` SET `cost`='27' WHERE `idEditions`='1';

DELETE FROM `periodicals`.`editions` WHERE `idEditions`='1';


-- CRUD for table `user`

SELECT * FROM periodicals.user;
INSERT INTO `periodicals`.`user` (`login`, `password`, `email`, `adress`, `admin`) VALUES ('kisa', '123', 'kisa@mail.ru', 'Gomel', 0);

UPDATE `periodicals`.`user` SET `adress`='Minsk' WHERE `idUser`='1';

DELETE FROM `periodicals`.`user` WHERE `idUser`='1';


-- CRUD for table `subscription`

SELECT * FROM periodicals.subscription;
INSERT INTO `periodicals`.`subscription` (`idEditions`, `idUser`, `startSubscription`, `stopSubscription`) VALUES ('2', '1', '2019-02-20 00:00:00',  '2019-07-20 00:00:00');

UPDATE `periodicals`.`subscription` SET `idUser`='2' WHERE `idSubscription`='1';

DELETE FROM `periodicals`.`subscription` WHERE `idSubscription`='1';


-- CRUD for table `payment`

SELECT * FROM periodicals.payment;
INSERT INTO `periodicals`.`payment` (`idUser`, `paymentAmount`, `paid`) VALUES ('2', '30', 1);

UPDATE `periodicals`.`payment` SET `paid`= 0 WHERE `idPayment`='1';

DELETE FROM `periodicals`.`payment` WHERE `idPayment`='1';
