-- MySQL Workbench Forward Engineering

use mydb;
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


-- -----------------------------------------------------
-- Table `mydb`.`proveedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`proveedor` (
  `idproveedor` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(45) NOT NULL,
  `marca` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idproveedor`),
  UNIQUE INDEX `nombre_UNIQUE` (`nombre` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `mydb`.`producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`producto` (
  `idproducto` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `peso` INT(10) NOT NULL,
  `precio` DOUBLE NOT NULL,
  `cantidad` INT NOT NULL,
  `codigo` LONGBLOB NOT NULL,
  `idproveedor` INT NOT NULL,
  `idcategoria` INT NOT NULL,
  `tamanioLetra` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`idproducto`),
  INDEX `fk_producto_proveedor_idx` (`idproveedor` ASC) VISIBLE,
  INDEX `fk_producto_categoria1_idx` (`idcategoria` ASC) VISIBLE,
  CONSTRAINT `fk_producto_categoria`
    FOREIGN KEY (`idcategoria`)
    REFERENCES `mydb`.`categoria` (`idcategoria`),
  CONSTRAINT `fk_producto_proveedor`
    FOREIGN KEY (`idproveedor`)
    REFERENCES `mydb`.`proveedor` (`idproveedor`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `mydb`.`ventas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`ventas` (
  `idventas` INT NOT NULL AUTO_INCREMENT,
  `fecha` VARCHAR(10) NOT NULL,
  `total` DOUBLE NOT NULL,
  `productosVendidos` INT NOT NULL,
  PRIMARY KEY (`idventas`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;
use mydb;
Select * from ventas;

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


-- -----------------------------------------------------
-- Table `mydb`.`importes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`importes` (
  `idimportes` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `fecha` DATE NOT NULL,
  `costo` DOUBLE NOT NULL,
  `descripcion` VARCHAR(45) NULL,
  PRIMARY KEY (`idimportes`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

INSERT INTO `mydb`.`user` (`iduser`, `nombre`, `password`, `correo`) VALUES ('2', '1', '1', '20193tn021@utez.edu.mx');
select * from user;

use mydb;
select * from producto;
select * from categoria;
select * from user;
select * from proveedor;
select * from ventas;

DELIMITER $$
DROP PROCEDURE IF EXISTS realizar_venta$$
CREATE PROCEDURE realizar_venta(IN idVenta INT, cantidadVenta INT)
BEGIN
	UPDATE producto SET cantidad = cantidad - cantidadVenta WHERE producto.idproducto = idVenta;
END
$$

DELIMITER $$
DROP PROCEDURE IF EXISTS busqueda_cantidad$$
CREATE PROCEDURE busqueda_cantidad(IN numMin INT, numMax INT)
BEGIN
	SELECT * FROM producto WHERE producto.cantidad >= numMin AND producto.cantidad <= numMax;
END
$$
use mydb;
call  busqueda_cantidad('41','50');
