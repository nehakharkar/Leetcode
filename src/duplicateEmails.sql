<<<<<<< HEAD
# Write your MySQL query statement below
select Email from Person
group by Email
=======
# Write your MySQL query statement below
select Email from Person
group by Email
>>>>>>> e892e121660e1fce933a8dffdab08824f1a9c925
having count(Email) >1;