package edu.pjatk.inn.coffeemaker.impl;
/**
 *
 * @author Ihor Debelyi & Oleksii Bondar
 *
 * Feedback of the order
 */
public class Feedback {

    private String description;
    private int grade;

    /**
     * Constructor, used to create a new instance of Feedback.
     * Initializes it with passed values;
     * @param description
     * @param grade
     */
    public Feedback(String description, int grade) {
        this.description = description;
        this.grade = grade;
    }

    /**
     * Provides the description of a particular instance of Feedback.
     *
     * @return Returns the description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description for a particular instance of Feedback.
     * Empty description is ignored.
     *
     * @param description The description to setValue. Empty value is ignored.
     */
    public void setDescription(String description) {
        if(!description.equals("")) {
            this.description = description;
        }

    }

    /**
     * Provides the grade of a particular instance of Feedback.
     *
     * @return Returns the grade.
     */
    public int getGrade() { return grade; }


    /**
     * Sets the grade for a particular instance of Feedback.
     * Only values from 1 to 5 are accepted.
     *
     * @param grade The grade to setValue.
     */
    public void setGrade(int grade) {
        if(grade >=1 && grade <= 5) {
            this.grade = grade;
        }
    }

    /**
     * Compares current instance of Feedback to another instance of Feedback based on description and grade.
     * Returns true if description and grade are the same.
     * Returns false if description and grade are different.
     *
     * @param f another instance of Feedback.
     * @return boolean result of comparison
     */
    public boolean equals(Feedback f) {
        if (this.description.equals(f.getDescription()) && this.grade == f.getGrade()) {
            return true;
        }
        return false;
    }

    /**
     * Provides string representation of the instance of a Feedback.
     *
     * @return Returns the description and grade.
     */
    public String toString() {
        return description + " " + grade;
    }

}
