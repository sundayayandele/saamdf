// Databricks notebook source
// MAGIC %md Practice

// COMMAND ----------

// MAGIC %sql
// MAGIC CREATE TABLE CustomerSource (
// MAGIC     CustomerID int NOT NULL,
// MAGIC     Title varchar(8),
// MAGIC     FirstName varchar(50),
// MAGIC     MiddleName varchar(50),
// MAGIC     LastName varchar(50),
// MAGIC     Suffix varchar(10),
// MAGIC     CompanyName varchar(128),
// MAGIC     SalesPerson varchar(256),
// MAGIC     EmailAddress varchar(50),
// MAGIC     Phone varchar(25))
// MAGIC desc customersource;

// COMMAND ----------

// MAGIC %sql
// MAGIC desc customersource
