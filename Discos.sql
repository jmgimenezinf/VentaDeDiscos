SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `Discografia` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish2_ci ;
USE `Discografia` ;

-- -----------------------------------------------------
-- Table `Discografia`.`Disco`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `Discografia`.`Disco` (
  `idDisco` INT NOT NULL AUTO_INCREMENT ,
  `Titulo` VARCHAR(145) NOT NULL ,
  `Autor` VARCHAR(255) NOT NULL ,
  `Formato` VARCHAR(45) NOT NULL ,
  `Genero` VARCHAR(45) NOT NULL ,
  `ISMN` VARCHAR(16) NOT NULL ,
  `Sello_discografico` VARCHAR(145) NOT NULL ,
  `Clasificacion` VARCHAR(45) NULL ,
  PRIMARY KEY (`idDisco`) ,
  UNIQUE INDEX `idDisco_UNIQUE` (`idDisco` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Discografia`.`Stock`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `Discografia`.`Stock` (
  `idStock` INT NOT NULL ,
  `Cantidad` INT NULL ,
  `Fecha_ingreso` DATE NULL ,
  PRIMARY KEY (`idStock`) )
ENGINE = InnoDB;

USE `Discografia` ;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
