SELECT 'Project A' as name, (DATE_PART('year', p.finish_date) - DATE_PART('year', p.start_date)) * 12 +
(DATE_PART('month', p.finish_date) - DATE_PART('month', p.start_date)) as MONTH_COUNT
from project p order by MONTH_COUNT desc limit 1