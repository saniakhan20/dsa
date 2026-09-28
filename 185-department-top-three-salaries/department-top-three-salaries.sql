# Write your MySQL query statement below
WITH ranked AS
(SELECT d.name AS department, e.name AS Employee, e.salary AS Salary,
DENSE_RANK() OVER( PARTITION BY d.id ORDER BY e.salary DESC) AS rnk
FROM Department d
JOIN Employee e
ON d.id=e.departmentId)
SELECT Department, Employee, Salary
FROM ranked
WHERE rnk<=3;
