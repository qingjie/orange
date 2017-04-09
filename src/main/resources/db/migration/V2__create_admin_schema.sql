-- -----------------------------------------------------
-- Table `admin`
-- -----------------------------------------------------
CREATE  TABLE `admin` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `username` VARCHAR(45) NULL ,
  `password` VARCHAR(45) NULL ,
  `firstname` VARCHAR(45) NULL ,
  `lastname` VARCHAR(45) NULL ,
  `email` VARCHAR(45) NULL ,
  `remember_token` VARCHAR(45) NULL ,
  `status` INT NULL ,
  `admin_permission_id` INT NOT NULL ,
  PRIMARY KEY (`id`, `admin_permission_id`) ,
  INDEX `fk_admin_admin_permission_idx` (`admin_permission_id` ASC) ,
  CONSTRAINT `fk_admin_admin_permission`
    FOREIGN KEY (`admin_permission_id` )
    REFERENCES `admin_permission` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- Placeholder
INSERT INTO admin (username, password, firstname, lastname,email,remember_token,status,admin_permission_id) VALUES ("admin", "123456", "qingjie","zhao","zhaoqingjie@gmail.com","yes",1,1);