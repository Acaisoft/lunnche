INSERT INTO restaurant (id, name) VALUES (1, 'Restaurant #1');
INSERT INTO restaurant (id, name) VALUES (2, 'Restaurant #2');

INSERT INTO meal (id, name, price, restaurant_id) VALUES (1, 'Meal #11', 10, 1);
INSERT INTO meal (id, name, price, restaurant_id) VALUES (2, 'Meal #12', 20, 1);

INSERT INTO meal (id, name, price, restaurant_id) VALUES (3, 'Meal #21', 15, 2);
INSERT INTO meal (id, name, price, restaurant_id) VALUES (4, 'Meal #22', 25, 2);

INSERT INTO "user" (id, first_name, last_name, balance, username, password)
VALUES (1, 'Jan', 'Kowalski', 50, 'jan.kowalski', 'password');
INSERT INTO "user" (id, first_name, last_name, balance, username, password)
VALUES (2, 'Stefan', 'Nowak', 100, 'stefan.nowak', 'password');

INSERT INTO "user" (id, first_name, last_name, balance, username, password)
VALUES (3, 'Maciej', 'Nowak', 150, 'maciej.nowak', 'password');

INSERT INTO purchase (id) VALUES (1);
INSERT INTO purchase (id) VALUES (2);

INSERT INTO purchase_order (id, user_id, meal_id, purchase_id) VALUES (1, 1, 1, 1);
INSERT INTO purchase_order (id, user_id, meal_id, purchase_id) VALUES (2, 2, 2, 1);

INSERT INTO purchase_order (id, user_id, meal_id, purchase_id) VALUES (3, 1, 4, 2);

