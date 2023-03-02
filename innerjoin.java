Q1.Create tables that show items, company city and also the units sold by each pizza company.
------------------------------------------------------------------------------------------------------------------------------------------


1.table name is company

+-----------+----------------+---------------+
| conpanyid | companyname    | companycity   |
+-----------+----------------+---------------+
|         1 | dominos        | losangles     |
|         2 | pizza hut      | san francisco |
|         3 | papa john      | san diego     |
|         4 | ah pizz        | san fremont   |
|         5 | nino pizza     | las vegas     |
|         6 | pizeria        | boston        |
|         7 | chuck ee chees | chicago       |
+-----------+----------------+---------------+
7 rows in set (0.00 sec)

2.table name is item
+--------+---------------+----------+
| itemid | itemname      | unitsold |
+--------+---------------+----------+
|      1 | large pizza   |        5 |
|      2 | garlic knots  |        6 |
|      3 | large pizza   |        3 |
|      4 | midium pizza  |        8 |
|      5 | breadsticks   |        7 |
|      6 | medium pizza  |       11 |
|      7 | small pizza   |        9 |
|      8 | small pizza   |        6 |
+--------+---------------+----------+
8 rows in set (0.00 sec)




3.select * from company inner join item on company.conpanyid=item.itemid;


+-----------+----------------+---------------+--------+---------------+----------+
| conpanyid | companyname    | companycity   | itemid | itemname      | unitsold |
+-----------+----------------+---------------+--------+---------------+----------+
|         1 | dominos        | losangles     |      1 | large pizza   |        5 |
|         2 | pizza hut      | san francisco |      2 | garlic knots  |        6 |
|         3 | papa john      | san diego     |      3 | large pizza   |        3 |
|         4 | ah pizz        | san fremont   |      4 | midium pizza  |        8 |
|         5 | nino pizza     | las vegas     |      5 | breadsticks   |        7 |
|         6 | pizeria        | boston        |      6 | medium pizza  |       11 |
|         7 | chuck ee chees | chicago       |      7 | small pizza   |        9 |
+-----------+----------------+---------------+--------+---------------+----------+
7 rows in set (0.00 sec)