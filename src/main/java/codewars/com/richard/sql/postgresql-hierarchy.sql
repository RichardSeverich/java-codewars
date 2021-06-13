CREATE DATABASE dbcompany;

CREATE TABLE employee (
    id INT NOT NULL,
    name VARCHAR(50),
    supervisor INT,
    PRIMARY KEY (id),
    FOREIGN KEY (supervisor) REFERENCES employee (Id)
);

-- CO  Chief executive officer
INSERT INTO employee (id, name, supervisor) VALUES (1, 'Richard CO', null);

-- Managers
INSERT INTO employee (id, name, supervisor) VALUES (2, 'Ana', 1);
INSERT INTO employee (id, name, supervisor) VALUES (3, 'Martin', 1);

-- Leads
INSERT INTO employee (id, name, supervisor) VALUES (4, 'Miky', 2);
INSERT INTO employee (id, name, supervisor) VALUES (5, 'Isabel', 2);
INSERT INTO employee (id, name, supervisor) VALUES (6, 'Mariana', 3);
INSERT INTO employee (id, name, supervisor) VALUES (7, 'Raul', 3);

-- Backend Developer team
INSERT INTO employee (id, name, supervisor) VALUES (8, 'Margarita', 4);
INSERT INTO employee (id, name, supervisor) VALUES (9, 'Alberto', 4);
INSERT INTO employee (id, name, supervisor) VALUES (10, 'Enrique', 4);

-- UI Developer team
INSERT INTO employee (id, name, supervisor) VALUES (11, 'Felipe', 5);
INSERT INTO employee (id, name, supervisor) VALUES (12, 'Helena', 5);
INSERT INTO employee (id, name, supervisor) VALUES (13, 'Lucas', 5);

-- Automation team
INSERT INTO employee (id, name, supervisor) VALUES (14, 'Luz', 6);
INSERT INTO employee (id, name, supervisor) VALUES (15, 'Ricardo', 6);
INSERT INTO employee (id, name, supervisor) VALUES (16, 'Mar', 6);

-- Manual team
INSERT INTO employee (id, name, supervisor) VALUES (17, 'Mateo', 7);
INSERT INTO employee (id, name, supervisor) VALUES (18, 'Daniel', 7);
INSERT INTO employee (id, name, supervisor) VALUES (19, 'Pablo', 7);

-- Clients/Products Owners
INSERT INTO employee (id, name, supervisor) VALUES (20, 'Diego', null);
INSERT INTO employee (id, name, supervisor) VALUES (21, 'Javier', null);
INSERT INTO employee (id, name, supervisor) VALUES (22, 'Mario', null);


-- A) Query to retrieve all employees: that are not supervisor of any employee.
SELECT * FROM employee WHERE employee.id
NOT IN (
  SELECT employee.supervisor
  FROM employee
  WHERE employee.supervisor IS NOT NULL
);

-- B) Query to retrieve all employees that does not have a supervisor.
SELECT * FROM employee WHERE supervisor IS NUll;

-- C) Query to retrieve all supervisors in the hierarchy of a given employee.
SELECT child.id,
       child.name,
       child.supervisor
FROM employee AS child
INNER JOIN employee AS parent
ON child.id = parent.id
WHERE child.id = 19


-- D) Query to retrieve all employees: that have suppervisor.
SELECT * FROM employee WHERE supervisor IS NOT NUll;

SELECT child.id,
       child.name,
       child.supervisor
FROM employee AS child
INNER JOIN employee AS parent
ON child.id = parent.id
WHERE child.supervisor = parent.supervisor


--- Query Select all but show the name of supervisor insted of id.
SELECT child.id,
       child.name,
       child.supervisor,
       parent.name
    FROM employee AS child
    LEFT JOIN employee AS parent
    ON child.supervisor = parent.id;

--- Query Select all with generation 1.
WITH RECURSIVE Hierarchy(ChildId, ChildName, Generation, Supervisor) as (
    SELECT Id, Name, 0, Supervisor
        FROM employee AS FirtGeneration
        WHERE Supervisor IS NULL
    UNION ALL
    SELECT NextGeneration.Id, NextGeneration.Name, Parent.Generation + 1, Parent.ChildId
        FROM employee AS NextGeneration
        INNER JOIN Hierarchy AS Parent ON NextGeneration.Supervisor = Parent.ChildId
)
SELECT * FROM Hierarchy;


--- Query Select all with generation 2.
WITH RECURSIVE cte AS (
SELECT id, name, supervisor, 1 AS level FROM employee
where supervisor is null
UNION  ALL
SELECT e.id, e.name, e.supervisor, c.level + 1 FROM cte c
JOIN   employee e ON e.supervisor = c.id
)
SELECT * FROM   cte;


--- Query Select all possibles parents
with RECURSIVE parent as (
  SELECT * FROM employee WHERE id = 9
  UNION ALL
  SELECT employee.*
  FROM employee
  JOIN parent ON parent.supervisor = employee.id
)
SELECT * FROM parent ORDER BY id;

--- Query Select all possibles children


--https://www.codeproject.com/Articles/818694/SQL-Queries-to-Manage-Hierarchical-or-Parent-child
