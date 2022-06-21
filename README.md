# spring

DB details:

Create schema company. Inside company schema we create below table

CREATE TABLE `employee_details` (

  `emp_id` int NOT NULL,
  
  `name` varchar(45) NOT NULL,
  
  `job_title` varchar(45) DEFAULT NULL,
  
  `salary` int DEFAULT NULL,
  
  `birth_date` date DEFAULT NULL,
  
  PRIMARY KEY (`emp_id`)
  
) ;


