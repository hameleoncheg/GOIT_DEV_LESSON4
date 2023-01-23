select  'YOUNGEST' as TYPE, w.name, w.birthday from worker as w WHERE  birthday=(SELECT MAX(birthday) FROM worker)
UNION
select  'OLDEST' as TYPE, w.name, w.birthday from worker as w WHERE  birthday=(SELECT MIN(birthday) FROM worker)