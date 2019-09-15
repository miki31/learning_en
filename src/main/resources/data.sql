use callan_vocabulary;

INSERT INTO user (id, first_name, last_name, nick_name, birthday, password, email, photo) VALUES
(1, 'SUPERAdmin', 'Sur_SUPERAdmin', 'aaa', '1970-1-1', '$2a$10$.xysUEZxutiwXaduiJJ8oeWpXU9FbU5W7ow9.0KdjBepM0w86ZAT.', 'super_admin@gmail.com', null),
(2, 'Admin', 'Sur_Admin', 'mmm', '1975-1-1', '$2a$10$.xysUEZxutiwXaduiJJ8oeWpXU9FbU5W7ow9.0KdjBepM0w86ZAT.', 'admin.com', null),
(3, 'Manager', 'Sur_Manager', 'sss', '1980-1-1', '$2a$10$.xysUEZxutiwXaduiJJ8oeWpXU9FbU5W7ow9.0KdjBepM0w86ZAT.', 'manager@gmail.com', null),
(4, 'User', 'Sur_User', 'uuu', '1985-1-1', '$2a$10$.xysUEZxutiwXaduiJJ8oeWpXU9FbU5W7ow9.0KdjBepM0w86ZAT.', 'user@gmail.com', null),
(5, 'TRANSLATOR', 'Sur_TRANSLATOR', 'ttt', '1990-1-1', '$2a$10$.xysUEZxutiwXaduiJJ8oeWpXU9FbU5W7ow9.0KdjBepM0w86ZAT.', 'translator@gmail.com', null),

(6, 'Олег', 'Пашкевич', 'тічер', '1972-10-22', '$2a$10$.xysUEZxutiwXaduiJJ8oeWpXU9FbU5W7ow9.0KdjBepM0w86ZAT.', 'tich123@gmail.com', null),
(7, 'Мар''ян', 'Лукаш', 'NOтічер', '1988-02-11', '$2a$10$.xysUEZxutiwXaduiJJ8oeWpXU9FbU5W7ow9.0KdjBepM0w86ZAT.', 'NOtich123@gmail.com', null),
(8, 'Світлана', 'Федорчук', 'NOтічер_2', '1979-01-01', '$2a$10$.xysUEZxutiwXaduiJJ8oeWpXU9FbU5W7ow9.0KdjBepM0w86ZAT.', 'NOOOtich123@gmail.com', null),
(9, 'Svitlana', 'Fedorchuk', 'Sveta', '1992-05-15', '$2a$10$.xysUEZxutiwXaduiJJ8oeWpXU9FbU5W7ow9.0KdjBepM0w86ZAT.', 'svetaF123@gmail.com', null),
(10, 'Misha', 'Shchepanskiy', 'mmm31', '1991-03-31', '$2a$10$.xysUEZxutiwXaduiJJ8oeWpXU9FbU5W7ow9.0KdjBepM0w86ZAT.', 'mmm31@gmail.com', null),
(11, 'Peter', 'Kolomya', 'Peterrr', '1966-06-09', '$2a$10$.xysUEZxutiwXaduiJJ8oeWpXU9FbU5W7ow9.0KdjBepM0w86ZAT.', 'petre3@gmail.com', null);

INSERT INTO role(id, name) VALUES
(1, "SUPER_ADMIN"),
(2, "ADMIN"),
(3, "MANAGER"),
(4, "TRANSLATOR"),
(5, "USER");

INSERT INTO user_role(user_id, role_id) VALUES
(1,1),
(2,2),
(3,3),
(4,4),
(5,5),
(6,1),
(6,2),
(6,3),
(6,4),
(6,5),
(7,5),
(8,4),
(9,4),
(10,4),
(11,4)
