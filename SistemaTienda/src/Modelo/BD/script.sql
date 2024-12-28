-- MySQL Workbench Forward Engineering
drop database mydb;
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`categoria` (
  `idcategoria` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idcategoria`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8mb3;
use mydb;
select * from user;
-- -----------------------------------------------------
-- Table `mydb`.`proveedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`proveedor` (
  `idproveedor` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `marca` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idproveedor`),
  UNIQUE INDEX `nombre_UNIQUE` (`nombre` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb3;

-- -----------------------------------------------------
-- Table `mydb`.`producto`
-- -----------------------------------------------------
drop table producto;

CREATE TABLE IF NOT EXISTS `mydb`.`producto` (
  `idproducto` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `peso` INT(10) NOT NULL,
  `precio` DOUBLE NOT NULL,
  `cantidad` INT NOT NULL,
  `codigo` INT(20) NOT NULL,
  `proveedor_idproveedor` INT NOT NULL,
  `categoria_idcategoria` INT NOT NULL,
  `tamanioLetra` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idproducto`, `proveedor_idproveedor`, `categoria_idcategoria`),
  INDEX `fk_producto_proveedor_idx` (`proveedor_idproveedor` ASC) VISIBLE,
  INDEX `fk_producto_categoria1_idx` (`categoria_idcategoria` ASC) VISIBLE,
  CONSTRAINT `fk_producto_categoria1`
    FOREIGN KEY (`categoria_idcategoria`)
    REFERENCES `mydb`.`categoria` (`idcategoria`),
  CONSTRAINT `fk_producto_proveedor`
    FOREIGN KEY (`proveedor_idproveedor`)
    REFERENCES `mydb`.`proveedor` (`idproveedor`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8mb3;

-- -----------------------------------------------------
-- Table `mydb`.`ventas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`ventas` (
  `idventas` INT NOT NULL AUTO_INCREMENT,
  `fecha` DATE NOT NULL,
  `total` DOUBLE NOT NULL,
  PRIMARY KEY (`idventas`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `mydb`.`detalleventa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`detalleventa` (
  `producto_idproducto` INT NOT NULL,
  `producto_proveedor_idproveedor` INT NOT NULL,
  `producto_categoria_idcategoria` INT NOT NULL,
  `ventas_idventas` INT NOT NULL,
  `total` DOUBLE NOT NULL,
  PRIMARY KEY (`producto_idproducto`, `producto_proveedor_idproveedor`, `producto_categoria_idcategoria`, `ventas_idventas`),
  INDEX `fk_producto_has_ventas_ventas1_idx` (`ventas_idventas` ASC) VISIBLE,
  INDEX `fk_producto_has_ventas_producto1_idx` (`producto_idproducto` ASC, `producto_proveedor_idproveedor` ASC, `producto_categoria_idcategoria` ASC) VISIBLE,
  CONSTRAINT `fk_producto_has_ventas_producto1`
    FOREIGN KEY (`producto_idproducto` , `producto_proveedor_idproveedor` , `producto_categoria_idcategoria`)
    REFERENCES `mydb`.`producto` (`idproducto` , `proveedor_idproveedor` , `categoria_idcategoria`),
  CONSTRAINT `fk_producto_has_ventas_ventas1`
    FOREIGN KEY (`ventas_idventas`)
    REFERENCES `mydb`.`ventas` (`idventas`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `mydb`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`user` (
  `iduser` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `correo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`iduser`))
ENGINE = InnoDB;
use mydb;
select * from user;
INSERT INTO `mydb`.`user` (`iduser`, `nombre`, `password`, `correo`) VALUES ('2', '1', '1', '20193tn021@utez.edu.mx');

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

Select * from categoria;
select * from proveedor;