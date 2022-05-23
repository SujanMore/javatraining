CREATE DATABASE  `web_customer_tracker` /* SQLINES DEMO *** RACTER SET latin1 */;
SET SCHEMA 'web_customer_tracker';
-- SQLINES DEMO ***  Distrib 5.6.13, for osx10.6 (i386)
--
-- SQLINES DEMO ***   Database: web_customer_tracker
-- SQLINES DEMO *** -------------------------------------
-- SQLINES DEMO *** 6.16

/* SQLINES DEMO *** ARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/* SQLINES DEMO *** ARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/* SQLINES DEMO *** LLATION_CONNECTION=@@COLLATION_CONNECTION */;
/* SQLINES DEMO *** tf8 */;
/* SQLINES DEMO *** ME_ZONE=@@TIME_ZONE */;
/* SQLINES DEMO *** NE='+00:00' */;
/* SQLINES DEMO *** IQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/* SQLINES DEMO *** REIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/* SQLINES DEMO *** L_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/* SQLINES DEMO *** L_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- SQLINES DEMO *** or table `customer`
--

DROP TABLE IF EXISTS customer;
/* SQLINES DEMO *** cs_client     = @@character_set_client */;
/* SQLINES DEMO *** er_set_client = utf8 */;
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE SEQUENCE customer_seq;

CREATE TABLE customer (
  id int NOT NULL DEFAULT NEXTVAL ('customer_seq'),
  first_name varchar(45) DEFAULT NULL,
  last_name varchar(45) DEFAULT NULL,
  email varchar(45) DEFAULT NULL,
  PRIMARY KEY (id)
)  ;

ALTER SEQUENCE customer_seq RESTART WITH 6;
/* SQLINES DEMO *** er_set_client = @saved_cs_client */;

--
-- SQLINES DEMO *** table `customer`
--

LOCK TABLES customer WRITE;
/* SQLINES DEMO ***  `customer` DISABLE KEYS */;

INSERT INTO customer VALUES 
	(1,'David','Adams','david@luv2code.com'),
	(2,'John','Doe','john@luv2code.com'),
	(3,'Ajay','Rao','ajay@luv2code.com'),
	(4,'Mary','Public','mary@luv2code.com'),
	(5,'Maxwell','Dixon','max@luv2code.com');

/* SQLINES DEMO ***  `customer` ENABLE KEYS */;
UNLOCK TABLES;
/* SQLINES DEMO *** NE=@OLD_TIME_ZONE */;

/* SQLINES DEMO *** E=@OLD_SQL_MODE */;
/* SQLINES DEMO *** _KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/* SQLINES DEMO *** CHECKS=@OLD_UNIQUE_CHECKS */;
/* SQLINES DEMO *** ER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/* SQLINES DEMO *** ER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/* SQLINES DEMO *** ON_CONNECTION=@OLD_COLLATION_CONNECTION */;
/* SQLINES DEMO *** ES=@OLD_SQL_NOTES */;

-- SQLINES DEMO ***  2016-09-24 21:50:59
