# **Итоговая контрольная работа**

 

 **Информация о проекте**

 Необходимо организовать систему учета для питомника в котором живут домашние и Pack animals.

 

**Как сдавать проект**

 

Для сдачи проекта необходимо создать отдельный общедоступный репозиторий(Github, gitlub, или Bitbucket). Разработку вести в этом репозитории, использовать пул реквесты на изменения. Программа должна запускаться и работать, ошибок при выполнении программы быть не должно. Программа, может использоваться в различных системах, поэтому необходимо разработать класс в виде конструктора

 

# **Задание**

 

**Операционные системы и виртуализация (Linux)**

 

1\. Использование команды cat в Linux

   \- Создать два текстовых файла: "Pets"(Домашние животные) и "Pack animals"(вьючные животные), используя команду \`cat\` в терминале Linux. В первом файле перечислить собак, кошек и хомяков. Во втором — лошадей, верблюдов и ослов.

   \- Объединить содержимое этих двух файлов в один и просмотреть его содержимое.

   \- Переименовать получившийся файл в "Human Friends"(.

Пример конечного вывода после команды “ls” :

Desktop Documents Downloads  HumanFriends.txt  Music  PackAnimals.txt  Pets.txt  Pictures  Videos

 

2\. Работа с директориями в Linux

   \- Создать новую директорию и переместить туда файл "Human Friends".

 

3\. Работа с MySQL в Linux. “Установить MySQL на вашу вычислительную машину ”

   \- Подключить дополнительный репозиторий MySQL и установить один из пакетов из этого репозитория.

 

4\. Управление deb-пакетами

   \- Установить и затем удалить deb-пакет, используя команду \`dpkg\`.

 

5\. История команд в терминале Ubuntu

   \- Сохранить и выложить историю ваших терминальных команд в Ubuntu.

В формате: Файла с ФИО, датой сдачи, номером группы(или потока)

 

**Объектно-ориентированное программирование**

 

6\. Диаграмма классов

   \- Создать диаграмму классов с родительским классом "Животные", и двумя подклассами: "Pets" и "Pack animals".

В составы классов которых в случае Pets войдут классы: собаки, кошки, хомяки, а в класс Pack animals войдут: Лошади, верблюды и ослы).

Каждый тип животных будет характеризоваться (например, имена, даты рождения, выполняемые команды и т.д)

Диаграмму можно нарисовать в любом редакторе, такими как Lucidchart, Draw.io, Microsoft Visio и других.

 

7\. Работа с MySQL (Задача выполняется в случае успешного выполнения задачи “Работа с MySQL в Linux. “Установить MySQL на вашу машину”

 

7.1. После создания диаграммы классов в 6 пункте, в 7 пункте база данных "Human Friends" должна быть структурирована в соответствии с этой диаграммой. Например, можно создать таблицы, которые будут соответствовать классам "Pets" и "Pack animals", и в этих таблицах будут поля, которые характеризуют каждый тип животных (например, имена, даты рождения, выполняемые команды и т.д.).

7.2   \- В ранее подключенном MySQL создать базу данных с названием "Human Friends".

   \- Создать таблицы, соответствующие иерархии из вашей диаграммы классов.

   \- Заполнить таблицы данными о животных, их командах и датами рождения.

   \- Удалить записи о верблюдах и объединить таблицы лошадей и ослов.

   \- Создать новую таблицу для животных в возрасте от 1 до 3 лет и вычислить их возраст с точностью до месяца.

   \- Объединить все созданные таблицы в одну, сохраняя информацию о принадлежности к исходным таблицам.

 

Пример заполненной таблицы для теста:

Лист "Pets"

| ID | Name | Type | BirthDate | Commands |
| ----- | ----- | ----- | ----- | ----- |
| 1 | Fido | Dog | 2020-01-01 | Sit, Stay, Fetch |
| 2 | Whiskers | Cat | 2019-05-15 | Sit, Pounce |
| 3 | Hammy | Hamster | 2021-03-10 | Roll, Hide |
| 4 | Buddy | Dog | 2018-12-10 | Sit, Paw, Bark |
| 5 | Smudge | Cat | 2020-02-20 | Sit, Pounce, Scratch |
| 6 | Peanut | Hamster | 2021-08-01 | Roll, Spin |
| 7 | Bella | Dog | 2019-11-11 | Sit, Stay, Roll |
| 8 | Oliver | Cat | 2020-06-30 | Meow, Scratch, Jump |

 

 Лист "PackAnimals"

| ID | Name | Type | BirthDate | Commands |
| ----- | ----- | ----- | ----- | ----- |
| 1 | Thunder | Horse | 2015-07-21 | Trot, Canter, Gallop |
| 2 | Sandy | Camel | 2016-11-03 | Walk, Carry Load |
| 3 | Eeyore | Donkey | 2017-09-18 | Walk, Carry Load, Bray |
| 4 | Storm | Horse | 2014-05-05 | Trot, Canter |
| 5 | Dune | Camel | 2018-12-12 | Walk, Sit |
| 6 | Burro | Donkey | 2019-01-23 | Walk, Bray, Kick |
| 7 | Blaze | Horse | 2016-02-29 | Trot, Jump, Gallop |
| 8 | Sahara | Camel | 2015-08-14 | Walk, Run |

 

 

 

 

8\. ООП и Java

   Создать иерархию классов в Java, который будет повторять диаграмму классов созданную в задаче 6(Диаграмма классов) .

 

9\. Программа-реестр домашних животных

	Написать программу на Java, которая будет имитировать реестр домашних животных.

Должен быть реализован следующий функционал:

	

	9.1. Добавление нового животного

    	Реализовать функциональность для добавления новых животных в реестр.      

 Животное должно определяться в правильный класс (например, "собака", "кошка", "хомяк" и т.д.)

    	

 

   9.2. Список команд животного

    	\- Вывести список команд, которые может выполнять добавленное животное (например, "сидеть", "лежать").

    	

	9.3. Обучение новым командам

    	\- Добавить возможность обучать животных новым командам.

  9.4 Вывести список животных по дате рождения

 

9.5. Навигация по меню

    	\- Реализовать консольный пользовательский интерфейс с меню для навигации между вышеуказанными функциями.

    	

10\. Счетчик животных

Создать механизм, который позволяет вывести на экран общее количество созданных животных любого типа (Как домашних, так и вьючных), то есть при создании каждого нового животного счетчик увеличивается на “1”.

   
# Решение:

## 1-2 
```

 leej@leej-VirtualBox:\~$ cd Pitomnik2/

leej@leej-VirtualBox:\~/Pitomnik2$ cat \> Pets.txt

Собака

Кошка

Хомяк

leej@leej-VirtualBox:\~/Pitomnik2$ cat \> PackAnimals.txt

Лошадь   	 

Верблюд

Оcел

leej@leej-VirtualBox:\~/Pitomnik2$ cat Pets.txt PackAnimals.txt \> Animals.txt

leej@leej-VirtualBox:\~/Pitomnik2$ cat Animals.txt

Собака

Кошка

Хомяк

Лошадь

Верблюд

Оcел

leej@leej-VirtualBox:\~/Pitomnik2$ mv Animals.txt HumanFriends.txt

leej@leej-VirtualBox:\~/Pitomnik2$ ls

HumanFriends.txt  PackAnimals.txt  Pets.txt  
leej@leej-VirtualBox:\~/Pitomnik2$ mkdir PetsDirectory

leej@leej-VirtualBox:\~/Pitomnik2$ mv HumanFriends.txt PetsDirectory/

leej@leej-VirtualBox:\~/Pitomnik2$ cd PetsDirectory/

leej@leej-VirtualBox:\~/Pitomnik2/PetsDirectory$ ls

HumanFriends.txt
```
## 3\. leej@leej-VirtualBox:\~/Pitomnik2/PetsDirectory$ sudo apt-get update
```
\[sudo\] пароль для leej:

http://ru.archive.ubuntu.com/ubuntu jammy InRelease

http://ru.archive.ubuntu.com/ubuntu jammy-updates InRelease \[128 kB\]                                                      	 

http://repo.mysql.com/apt/ubuntu jammy InRelease                                                                          	 

http://security.ubuntu.com/ubuntu jammy-security InRelease \[129 kB\]                                                       	 

https://ppa.launchpadcontent.net/deadsnakes/ppa/ubuntu jammy InRelease                                   	 

http://ru.archive.ubuntu.com/ubuntu jammy-backports InRelease                                            	 

http://ru.archive.ubuntu.com/ubuntu jammy-updates/main i386 Packages \[703 kB\]

http://ru.archive.ubuntu.com/ubuntu jammy-updates/main amd64 Packages \[2 062 kB\]

http://security.ubuntu.com/ubuntu jammy-security/main i386 Packages \[544 kB\]             	 

http://ru.archive.ubuntu.com/ubuntu jammy-updates/main Translation-en \[356 kB\]

http://ru.archive.ubuntu.com/ubuntu jammy-updates/main amd64 c-n-f Metadata \[17,8 kB\]	 

http://ru.archive.ubuntu.com/ubuntu jammy-updates/restricted amd64 Packages \[2 499 kB\]	 

http://security.ubuntu.com/ubuntu jammy-security/main amd64 Packages \[1 844 kB\]                      	 

http://ru.archive.ubuntu.com/ubuntu jammy-updates/restricted Translation-en \[430 kB\]

http://ru.archive.ubuntu.com/ubuntu jammy-updates/universe i386 Packages \[733 kB\]         	 

http://security.ubuntu.com/ubuntu jammy-security/main Translation-en \[298 kB\]      	 

http://ru.archive.ubuntu.com/ubuntu jammy-updates/universe amd64 Packages \[1 125 kB\]  	 

http://security.ubuntu.com/ubuntu jammy-security/main amd64 c-n-f Metadata \[13,3 kB\]     	 

http://security.ubuntu.com/ubuntu jammy-security/restricted amd64 Packages \[2 439 kB\]       	 

http://ru.archive.ubuntu.com/ubuntu jammy-updates/universe Translation-en \[262 kB\]               	 

http://security.ubuntu.com/ubuntu jammy-security/restricted Translation-en \[420 kB\]                  	 

http://security.ubuntu.com/ubuntu jammy-security/universe amd64 Packages \[906 kB\]             	 

http://ru.archive.ubuntu.com/ubuntu jammy-updates/universe amd64 c-n-f Metadata \[26,1 kB\]    	 

http://security.ubuntu.com/ubuntu jammy-security/universe i386 Packages \[629 kB\]        	 

http://security.ubuntu.com/ubuntu jammy-security/universe Translation-en \[177 kB\]

http://security.ubuntu.com/ubuntu jammy-security/universe amd64 c-n-f Metadata \[19,3 kB\]

Получено 15,8 MB за 6с (2 451 kB/s)                                                                                             	 

Чтение списков пакетов… Готово

leej@leej-VirtualBox:\~/Pitomnik2/PetsDirectory$ sudo apt-get intstall mysql-server

E: Неверная операция intstall

leej@leej-VirtualBox:\~/Pitomnik2/PetsDirectory$ sudo apt-get install mysql-server

Чтение списков пакетов… Готово

Построение дерева зависимостей… Готово

Чтение информации о состоянии… Готово    	 

Уже установлен пакет mysql-server самой новой версии (8.0.39-1ubuntu22.04).

Обновлено 0 пакетов, установлено 0 новых пакетов, для удаления отмечено 0 пакетов, и 44 пакетов не обновлено.

leej@leej-VirtualBox:\~/Pitomnik2/PetsDirectory$ mysql \--version

mysql  Ver 8.0.39 for Linux on x86\_64 (MySQL Community Server \- GPL)
```
## 4\.
```
leej@leej-VirtualBox:\~/Pitomnik2/PetsDirectory$ sudo apt-get install cowsay

Чтение списков пакетов… Готово

Построение дерева зависимостей… Готово

Чтение информации о состоянии… Готово    	 

Предлагаемые пакеты:

  filters cowsay-off

Следующие НОВЫЕ пакеты будут установлены:

  cowsay

Обновлено 0 пакетов, установлено 1 новых пакетов, для удаления отмечено 0 пакетов, и 44 пакетов не обновлено.

Необходимо скачать 18,6 kB архивов.

После данной операции объём занятого дискового пространства возрастёт на 93,2 kB.

http://ru.archive.ubuntu.com/ubuntu jammy/universe amd64 cowsay all 3.03+dfsg2-8 \[18,6 kB\]

Получено 18,6 kB за 0с (47,5 kB/s)

Выбор ранее не выбранного пакета cowsay.

(Чтение базы данных … на данный момент установлено 229806 файлов и каталогов.)

Подготовка к распаковке …/cowsay\_3.03+dfsg2-8\_all.deb …

Распаковывается cowsay (3.03+dfsg2-8) …

Настраивается пакет cowsay (3.03+dfsg2-8) …

Обрабатываются триггеры для man-db (2.10.2-1) …

leej@leej-VirtualBox:\~/Pitomnik2/PetsDirectory$ cowsay "Здарова отец\!"

 \_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

\< Здарова отец\! \>

 \---------------

    	\\   ^\_\_^

     	\\  (oo)\\\_\_\_\_\_\_\_

        	(\_\_)\\   	)\\/\\

            	||----w |

            	|| 	||

leej@leej-VirtualBox:\~/Pitomnik2/PetsDirectory$ sudo apt-get remove cowsay

Чтение списков пакетов… Готово

Построение дерева зависимостей… Готово

Чтение информации о состоянии… Готово    	 

Следующие пакеты будут УДАЛЕНЫ:

  cowsay

Обновлено 0 пакетов, установлено 0 новых пакетов, для удаления отмечено 1 пакетов, и 44 пакетов не обновлено.

После данной операции объём занятого дискового пространства уменьшится на 93,2 kB.

Хотите продолжить? \[Д/н\] y

(Чтение базы данных … на данный момент установлено 229866 файлов и каталогов.)

Удаляется cowsay (3.03+dfsg2-8) …

Обрабатываются триггеры для man-db (2.10.2-1) …
```
## 5\.  
``` 
leej@leej-VirtualBox:\~/Pitomnik2/PetsDirectory$ history \> history.txt

1573  cd Pitomnik2/

 1574  cat \> Pets.txt

 1575  cat \> PackAnimals.txt

 1576  cat Pets.txt PackAnimals.txt \> Animals.txt

 1577  cat Animals.txt

 1578  mv Animals.txt HumanFriends.txt

 1579  ls

 1580  mkdir PetsDirectory

 1581  mv HumanFriends.txt PetsDirectory/

 1582  cd PetsDirectory/

 1583  ls

 1584  sudo apt-get update

 1585  sudo apt-get intstall mysql-server

 1586  sudo apt-get install mysql-server

 1587  mysql \--version

 1588  sudo apt-get install cowsay

 1589\* cowsay "Здарова отец

 1590  sudo apt-get remove cowsay

 1591  history \> history.txt

```
## 6\.

![][image1]

## 7\. 
```
mysql\> CREATE DATABASE HumanFriends;

Query OK, 1 row affected (0,14 sec)

mysql\> USE HumanFriends;

Database changed

mysql\>	CREATE TABLE Pets (

	\-\>    	ID INT AUTO\_INCREMENT PRIMARY KEY,

	\-\>    	Name VARCHAR(50),

	\-\>    	Type VARCHAR(20),

	\-\>    	BirthDate DATE,

	\-\>    	Commands TEXT

	\-\>	);

Query OK, 0 rows affected (0,31 sec)

mysql\>

mysql\>	CREATE TABLE PackAnimals (

	\-\>    	ID INT AUTO\_INCREMENT PRIMARY KEY,

	\-\>    	Name VARCHAR(50),

	\-\>    	Type VARCHAR(20),

	\-\>    	BirthDate DATE,

	\-\>    	Commands TEXT

	\-\>	);

Query OK, 0 rows affected (0,26 sec)

mysql\>    

mysql\> INSERT INTO Pets (Name, Type, BirthDate, Commands) VALUES

	\-\> ('Fido', 'Dog', '2020-01-01', 'Sit, Stay, Fetch'),

	\-\> ('Whiskers', 'Cat', '2019-05-15', 'Sit, Pounce'),

	\-\> ('Hammy', 'Hamster', '2021-03-10', 'Roll, Hide'),

	\-\> ('Buddy', 'Dog', '2018-12-10', 'Sit, Paw, Bark'),

	\-\> ('Smudge', 'Cat', '2020-02-20', 'Sit, Pounce, Scratch'),

	\-\> ('Peanut', 'Hamster', '2021-08-01', 'Roll, Spin'),

	\-\> ('Bella', 'Dog', '2019-11-11', 'Sit, Stay, Roll'),

	\-\> ('Oliver', 'Cat', '2020-06-30', 'Meow, Scratch, Jump');

Query OK, 8 rows affected (0,17 sec)

Records: 8  Duplicates: 0  Warnings: 0

mysql\> INSERT INTO PackAnimals (Name, Type, BirthDate, Commands) VALUES

	\-\> ('Thunder', 'Horse', '2015-07-21', 'Trot, Canter, Gallop'),

	\-\> ('Sandy', 'Camel', '2016-11-03', 'Walk, Carry Load'),

	\-\> ('Eeyore', 'Donkey', '2017-09-18', 'Walk, Carry Load, Bray'),

	\-\> ('Storm', 'Horse', '2014-05-05', 'Trot, Canter'),

	\-\> ('Dune', 'Camel', '2018-12-12', 'Walk, Sit'),

	\-\> ('Burro', 'Donkey', '2019-01-23', 'Walk, Bray, Kick'),

	\-\> ('Blaze', 'Horse', '2016-02-29', 'Trot, Jump, Gallop'),

	\-\> ('Sahara', 'Camel', '2015-08-14', 'Walk, Run');

Query OK, 8 rows affected (0,05 sec)

Records: 8  Duplicates: 0  Warnings: 0

mysql\> DELETE FROM PackAnimals WHERE Type \= 'Camel';

Query OK, 3 rows affected (0,03 sec)

mysql\> CREATE TABLE CombinedAnimals AS

	\-\> SELECT \* FROM Pets

	\-\> UNION ALL

	\-\> SELECT \* FROM PackAnimals;

Query OK, 13 rows affected (0,17 sec)

Records: 13  Duplicates: 0  Warnings: 0

mysql\> CREATE TABLE YoungAnimals AS

	\-\> SELECT

	\-\> 	ID,

	\-\> 	Name,

	\-\> 	Type,

	\-\> 	BirthDate,

	\-\> 	Commands,

	\-\> 	FLOOR(DATEDIFF(CURDATE(), BirthDate)/30) AS AgeInMonths

	\-\> FROM

	\-\> 	CombinedAnimals

	\-\> WHERE

	\-\> 	DATEDIFF(CURDATE(), BirthDate) BETWEEN 365 AND 1095;

Query OK, 0 rows affected (0,23 sec)

Records: 0  Duplicates: 0  Warnings: 0

mysql\> CREATE TABLE AllAnimals AS

	\-\> SELECT

	\-\> 	'Pets' AS Category,

	\-\> 	ID,

	\-\> 	Name,

	\-\> 	Type,

	\-\> 	BirthDate,

	\-\> 	Commands

	\-\> FROM

	\-\> 	Pets

	\-\> UNION ALL

	\-\> SELECT

	\-\> 	'PackAnimals' AS Category,

	\-\> 	ID,

	\-\> 	Name,

	\-\> 	Type,

	\-\> 	BirthDate,

	\-\> 	Commands

	\-\> FROM

	\-\> 	PackAnimals

	\-\> UNION ALL

	\-\> SELECT

	\-\> 	'CombinedAnimals' AS Category,

	\-\> 	ID,

	\-\> 	Name,

	\-\> 	Type,

	\-\> 	BirthDate,

	\-\> 	Commands

	\-\> FROM

	\-\> 	CombinedAnimals

	\-\> UNION ALL

	\-\> SELECT

	\-\> 	'YoungAnimals' AS Category,

	\-\> 	ID,

	\-\> 	Name,

	\-\> 	Type,

	\-\> 	BirthDate,

	\-\> 	Commands

	\-\> FROM

	\-\> 	YoungAnimals;

Query OK, 26 rows affected (0,19 sec)

Records: 26  Duplicates: 0  Warnings: 0
```
8-10. Программа.

 

[image1]: <data:image/png;base64,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>