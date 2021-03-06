package com.jetbrains.code;

/**
 * Simple example of a record.
 *
 * If you want to change a property name you should use refactoring
 *
 * @param id unique identifier
 * @param name the descriptive name
 */
record Record(int id, String name) {
    // - Generate a constructor. Note: non-public constructors supported (Java 15)
    // - Generate an accessor. Note: annotations supported (Java 15)
    // - Generate getter does the right thing with the name
    // - There is no generate setter

    //<editor-fold desc="Helper methods">
    @SuppressWarnings("unused")
    private void validateMyFields(int id, String name) {
        // do validate fields
    }
    //</editor-fold>

}

