package com.agribank.qldvutils.helper;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

public class HelperFunction {
    public static String getTableName(Class<?> entityClass) {
        // Check if the class is annotated with @Entity
        if (entityClass.isAnnotationPresent(Entity.class)) {
            // Check if the class is annotated with @Table
            if (entityClass.isAnnotationPresent(Table.class)) {
                Table tableAnnotation = entityClass.getAnnotation(Table.class);
                return tableAnnotation.name(); // Return the table name
            } else {
                // Default table name is the entity class name if @Table is not used
                return entityClass.getSimpleName();
            }
        }
        throw new IllegalArgumentException("Class " + entityClass.getName() + " is not a JPA entity.");
    }
}
