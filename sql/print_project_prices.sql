SELECT CONCAT ('Project',p.id) as name,(SUM(w.salary)*SUM((DATE_PART('year', p.finish_date) - DATE_PART('year', p.start_date)) * 12 +
(DATE_PART('month', p.finish_date) - DATE_PART('month', p.start_date)))) as price
from project p
INNER JOIN project_worker e on p.id = e.project_id
INNER JOIN worker w on e.worker_id = w.id 
group by p.id 