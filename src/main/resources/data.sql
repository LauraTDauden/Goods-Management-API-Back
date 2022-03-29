INSERT INTO supplier (name, country) VALUES ('Supplierz', 'Spain');
INSERT INTO supplier (name, country) VALUES ('ImportCO', 'Italy');
INSERT INTO supplier (name, country) VALUES ('Produk-t', 'UK');

INSERT INTO USER (USERNAME, PASSWORD, ROLE) VALUES ('admin', 'admin', 1);
INSERT INTO USER (USERNAME, PASSWORD, ROLE) VALUES ('user', 'user', 0);
INSERT INTO USER (USERNAME, PASSWORD, ROLE) VALUES ('laura', 'laura', 0);
INSERT INTO USER (USERNAME, PASSWORD, ROLE) VALUES ('1', '1', 0);

INSERT INTO ITEM (ITEM_CODE, DESCRIPTION, PRICE, STATE, CREATOR_USER_ID, CREATION_DATE) VALUES (1, 'Blue table', '45.90', 0, 2, '2020-02-01 20:47:52.69' );
INSERT INTO ITEM (ITEM_CODE, DESCRIPTION, PRICE, STATE, CREATOR_USER_ID, CREATION_DATE) VALUES (2, 'Green sofa', '458.90', 0, 3, '2019-11-22 20:47:52.69' );
INSERT INTO ITEM (ITEM_CODE, DESCRIPTION, PRICE, STATE, CREATOR_USER_ID, CREATION_DATE) VALUES (6, 'White table', '30', 0, 2, '2021-01-22 19:49:52.69' );
INSERT INTO ITEM (ITEM_CODE, DESCRIPTION, PRICE, STATE, CREATOR_USER_ID, CREATION_DATE) VALUES (9, 'Black sofa with stars', '300.90', 0, 2, '2019-06-22 20:47:52.69' );
INSERT INTO ITEM (ITEM_CODE, DESCRIPTION, PRICE, STATE, CREATOR_USER_ID, CREATION_DATE) VALUES (10, 'Red victorian chair', '87', 1, 2, '2015-05-19 18:47:52.69'  );

INSERT INTO ITEM_SUPPLIERS (ITEM_ITEM_ID, SUPPLIERS_SUPPLIER_ID  ) VALUES (1,1);
INSERT INTO ITEM_SUPPLIERS (ITEM_ITEM_ID, SUPPLIERS_SUPPLIER_ID  ) VALUES (1,2);
INSERT INTO ITEM_SUPPLIERS (ITEM_ITEM_ID, SUPPLIERS_SUPPLIER_ID  ) VALUES (3,2);

INSERT INTO PRICE_REDUCTION (START_DATE, END_DATE, REDUCED_PRICE) VALUES ('2021-09-17 18:47:52.69', '2021-08-17 18:47:52.69', 250);
INSERT INTO PRICE_REDUCTION (START_DATE, END_DATE, REDUCED_PRICE) VALUES ('2022-02-01 18:47:52.69', '2022-02-03 18:47:52.69', 225);
INSERT INTO PRICE_REDUCTION (START_DATE, END_DATE, REDUCED_PRICE) VALUES ('2021-09-17 18:47:52.69', '2021-08-17 18:47:52.69', 20);

INSERT INTO ITEM_PRICE_REDUCTIONS (ITEM_ITEM_ID, PRICE_REDUCTIONS_PRICE_REDUCTION_ID) VALUES (4,1);
INSERT INTO ITEM_PRICE_REDUCTIONS (ITEM_ITEM_ID, PRICE_REDUCTIONS_PRICE_REDUCTION_ID) VALUES (4,2);
INSERT INTO ITEM_PRICE_REDUCTIONS (ITEM_ITEM_ID, PRICE_REDUCTIONS_PRICE_REDUCTION_ID) VALUES (3,3);

