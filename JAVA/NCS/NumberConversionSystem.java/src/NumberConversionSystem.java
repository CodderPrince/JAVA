/*
 * Title:         Number Conversion System
 * Developed by:  Md. An Nahian Prince
 * ID:            12105007
 * Availability:  Converts and performs arithmetic on custom/predefined bases 
 *                (Binary, Decimal, Octal, Hexadecimal).
 * Key Features:
 * - Custom base number operations
 * - Base conversions (Binary, Decimal, Octal, Hexadecimal, Custom)
 * - Addition and subtraction in any base
 * - Fractional number support
 * 
 * Limitation: Only converted upto 36 base only
 */

package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class NumberConversionSystem extends Application {

    @Override
    /******************************
     * 
     * Primary or First Window
     * 
     *****************************/

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Number Conversion System");

        VBox mainLayout = new VBox(50);

        mainLayout.setPadding(new Insets(20, 20, 20, 20));
        mainLayout.setAlignment(Pos.CENTER);

        mainLayout.setStyle("-fx-background-color: linear-gradient(to bottom, #ffd4c2, #ffe5d1\r\n"
                + ");");

        Label titleLabel = new Label("Number Conversion System");
        titleLabel.setFont(Font.font("Arial", 28));

        Button customBaseButton = new Button("Use Custom Base");
        setButtonStyle(customBaseButton, "#1B5E20", 35);

        customBaseButton.setOnAction(e -> openCustomBaseSelection(primaryStage));

        Button defaultBaseButton = new Button("Use Default Base");
        setButtonStyle(defaultBaseButton, "#4A148C", 36);

        defaultBaseButton.setOnAction(e -> openDefaultBaseSelection(primaryStage));

        Button universalBaseButton = new Button("Universal Base Converter");
        setButtonStyle(universalBaseButton, "#0D47A1", 30);
        universalBaseButton.setOnAction(e -> openUniversalBaseConverter(primaryStage));

        mainLayout.getChildren().addAll(titleLabel, customBaseButton, defaultBaseButton, universalBaseButton);

        Scene mainScene = new Scene(mainLayout, 450, 500);
        primaryStage.setScene(mainScene);
        primaryStage.show();

    }

    /*****************************
     * 
     * If press "Use Custom Base"
     * Open Second Display
     * 
     ****************************/

    private void openCustomBaseSelection(Stage primaryStage) {
        VBox selectionLayout = new VBox(15);
        selectionLayout.setPadding(new Insets(20));
        selectionLayout.setAlignment(Pos.CENTER);
        selectionLayout.setStyle("-fx-background-color: linear-gradient(to bottom, #e0c3fc, #8ec5fc);");

        Button addButton = new Button("Addition");
        setButtonStyle(addButton, "#2E7D32", 35);

        addButton.setOnAction(e -> openCustomBaseWindow(primaryStage, "Add"));

        Button subtractButton = new Button("Subtraction");
        setButtonStyle(subtractButton, "#0D47A1", 35);

        subtractButton.setOnAction(e -> openCustomBaseWindow(primaryStage, "Subtract"));

        Button convertButton = new Button("Convert");
        setButtonStyle(convertButton, "#F57C00", 35);

        convertButton.setOnAction(e -> openCustomBaseWindow(primaryStage, "Convert"));

        Button backButton = new Button("Back");
        setButtonStyle(backButton, "#f44336", 35);

        backButton.setOnAction(e -> start(primaryStage));

        selectionLayout.getChildren().addAll(addButton, subtractButton, convertButton, backButton);

        Scene selectionScene = new Scene(selectionLayout, 400, 380);
        primaryStage.setScene(selectionScene);

    }

    /*********************************
     * 
     * Else If press "Use Default Base"
     * Open Second Display
     * 
     *******************************/

    private void openDefaultBaseSelection(Stage primaryStage) {
        VBox selectionLayout = new VBox(15);

        selectionLayout.setPadding(new Insets(20));
        selectionLayout.setAlignment(Pos.CENTER);
        selectionLayout.setStyle("-fx-background-color: linear-gradient(to bottom, #fafcc2, #fefbd8);");

        Button addButton = new Button("Addition");
        setButtonStyle(addButton, "#2E7D32", 35);

        addButton.setOnAction(e -> openDefaultBaseWindow(primaryStage, "Add"));

        Button subtractButton = new Button("Subtraction");
        setButtonStyle(subtractButton, "#0D47A1", 35);

        subtractButton.setOnAction(e -> openDefaultBaseWindow(primaryStage, "Subtract"));

        Button convertButton = new Button("Convert");
        setButtonStyle(convertButton, "#F57C00", 35);

        convertButton.setOnAction(e -> openDefaultBaseWindow(primaryStage, "Convert"));

        Button backButton = new Button("Back");
        setButtonStyle(backButton, "#f44336", 35);

        backButton.setOnAction(e -> start(primaryStage));

        selectionLayout.getChildren().addAll(addButton, subtractButton, convertButton, backButton);

        Scene selectionScene = new Scene(selectionLayout, 400, 380);
        primaryStage.setScene(selectionScene);

    }

    /****************************************
     * 
     * Else press "Universal Base Converter"
     * Open Second Display
     * 
     ****************************************/
    private void openUniversalBaseConverter(Stage primaryStage) {
        VBox layout = new VBox(15);
        layout.setPadding(new Insets(20));
        layout.setAlignment(Pos.CENTER);
        layout.setStyle("-fx-background-color: linear-gradient(to bottom, #b7eaff, #94dfff);");

        Label fromBaseLabel = new Label("From Base:");
        fromBaseLabel.setStyle("-fx-font-size: 17px; " +
                "-fx-font-family: 'Arial Rounded MT Bold'; " +
                "-fx-text-fill: blue;");

        TextField fromBaseInput = new TextField();
        fromBaseInput.setPromptText("Enter original base");
        fromBaseInput.setStyle("-fx-font-size: 17px; " +
                "-fx-font-family: 'Arial Rounded MT Bold'; " +
                "-fx-text-fill: blue;");
        Label numberLabel = new Label("Number to Convert:");
        numberLabel.setStyle("-fx-font-size: 17px; " +
                "-fx-font-family: 'Arial Rounded MT Bold'; " +
                "-fx-text-fill: #006400;");

        TextField numberInput = new TextField();
        numberInput.setPromptText("Enter number");
        numberInput.setStyle("-fx-font-size: 17px; " +
                "-fx-font-family: 'Arial Rounded MT Bold'; " +
                "-fx-text-fill: #006400;");

        Label toBaseLabel = new Label("To Base:");
        toBaseLabel.setStyle("-fx-font-size: 17px; " +
                "-fx-font-family: 'Arial Rounded MT Bold'; " +
                "-fx-text-fill: #4B0082;");

        TextField toBaseInput = new TextField();
        toBaseInput.setPromptText("Enter target base");
        toBaseInput.setStyle("-fx-font-size: 17px; " +
                "-fx-font-family: 'Arial Rounded MT Bold'; " +
                "-fx-text-fill: #4B0082;");

        Button convertButton = new Button("Convert");
        setButtonStyle(convertButton, "#4CAF50", 20);
        Label resultLabel = new Label();

        convertButton.setOnAction(e -> {
            try {
                int fromBase = Integer.parseInt(fromBaseInput.getText());
                int toBase = Integer.parseInt(toBaseInput.getText());
                String number = numberInput.getText();
                String result = convertNumberBetweenBases(number, fromBase, toBase);
                resultLabel.setText("Result: " + result);

                resultLabel.setStyle(
                        "-fx-font-size: 22px; -fx-text-fill: blue; -fx-font-family: 'Arial Rounded MT Bold';"); // Set
                                                                                                                // to
                                                                                                                // blue
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid base or number format.");
                resultLabel
                        .setStyle("-fx-font-size: 17px; -fx-text-fill: red; -fx-font-family: 'Arial Rounded MT Bold';");
            }
        });

        Button backButton = new Button("Back");
        setButtonStyle(backButton, "#f44336", 20);
        backButton.setOnAction(e -> start(primaryStage));

        layout.getChildren().addAll(fromBaseLabel, fromBaseInput, numberLabel, numberInput, toBaseLabel, toBaseInput,
                convertButton, resultLabel, backButton);

        Scene converterScene = new Scene(layout, 400, 430);
        primaryStage.setScene(converterScene);
    }

    /**********************************************
     * 
     * Second Window for Universal Base Converter
     * 
     **********************************************/
    private String convertNumberBetweenBases(String number, int fromBase, int toBase) {
        StringBuilder result = new StringBuilder();
        String[] parts = number.split("\\.");

        int integerPart = Integer.parseInt(parts[0], fromBase);
        result.append("1. Convert " + number + " from base " + fromBase + " to decimal.\n");
        result.append("   - Integer part: " + integerPart + "\n");

        double fractionalPart = 0;

        if (parts.length > 1) {
            StringBuilder fractionalDetails = new StringBuilder("   - Fractional part calculated as:\n");

            for (int i = 0; i < parts[1].length(); i++) {
                int digitValue = Character.digit(parts[1].charAt(i), fromBase);
                fractionalPart += digitValue / Math.pow(fromBase, i + 1);
                fractionalDetails.append("     + " + digitValue + " * " + fromBase + "^(-" + (i + 1) + ")\n");
            }

            result.append(fractionalDetails);
        }

        result.append("   - Result in decimal: " + integerPart + "."
                + String.format("%.15f", fractionalPart).substring(2) + "\n");

        result.append("2. Result in decimal: " + integerPart + "." + String.format("%.15f", fractionalPart).substring(2)
                + "\n");

        double decimalValue = integerPart + fractionalPart;
        result.append("3. Convert decimal " + decimalValue + " to base " + toBase + ".\n");

        String integerResult = Integer.toString(integerPart, toBase).toUpperCase();
        result.append("   - Result: " + integerResult);

        StringBuilder fractionalStr = new StringBuilder(".");
        while (fractionalPart != 0 && fractionalStr.length() < 20) {
            fractionalPart *= toBase;
            int fractionalIntPart = (int) fractionalPart;
            fractionalStr.append(Integer.toString(fractionalIntPart, toBase).toUpperCase());
            fractionalPart -= fractionalIntPart;
        }

        result.append(fractionalStr);
        result.append("\n");

        return result.toString();
    }

    /*********************************************
     * 
     * This is also Second Display
     * When press button then Third Display Open
     * Third Display For Custom Base
     * 
     *********************************************/

    private void openCustomBaseWindow(Stage primaryStage, String operation) {
        VBox customLayout = new VBox(15);
        customLayout.setPadding(new Insets(20));
        customLayout.setAlignment(Pos.CENTER);
        customLayout.setStyle("-fx-background-color: #f5f5f5;");

        Label baseLabel = new Label("Enter Your Base:");
        baseLabel.setStyle("-fx-font-size: 17px; -fx-text-fill: #0D47A1; -fx-font-family: 'Arial Rounded MT Bold';");

        TextField baseInput = new TextField();
        baseInput.setPromptText("Enter base (e.g., 2 for Binary, 8 for Octal)");
        baseInput.setStyle("-fx-font-size: 17px; -fx-text-fill: #000000; -fx-font-family: 'Arial Rounded MT Bold';");

        Label numberLabel1 = new Label("Enter First Base Number:");
        numberLabel1.setStyle("-fx-font-size: 17px; -fx-text-fill: #0D47A1; -fx-font-family: 'Arial Rounded MT Bold';");

        TextField numberInput1 = new TextField();
        numberInput1.setPromptText("Enter first base number");
        numberInput1.setStyle("-fx-font-size: 17px; -fx-text-fill: #000000; -fx-font-family: 'Arial Rounded MT Bold';");

        Label numberLabel2 = new Label("Enter Second Base Number:");
        numberLabel2.setStyle("-fx-font-size: 17px; -fx-text-fill: #0D47A1; -fx-font-family: 'Arial Rounded MT Bold';");

        TextField numberInput2 = new TextField();
        numberInput2.setPromptText("Enter second base number");
        numberInput2.setStyle("-fx-font-size: 17px; -fx-text-fill: #000000; -fx-font-family: 'Arial Rounded MT Bold';");

        ComboBox<String> targetBaseBox = new ComboBox<>();
        targetBaseBox.getItems().addAll("Decimal", "Binary", "Octal", "Hexadecimal", "Custom");
        targetBaseBox.setPromptText("Select target base");

        targetBaseBox.setStyle(
                "-fx-font-size: 17px; " +
                        "-fx-font-family: 'Arial Rounded MT Bold'; " +
                        "-fx-text-fill: #0D47A1;");

        Label resultLabel = new Label();

        Button actionButton = new Button(operation);
        setButtonStyle(actionButton, "#4CAF50", 20);

        Button backButton = new Button("Back");
        setButtonStyle(backButton, "#f44336", 20);

        if (operation.equals("Convert")) {
            customLayout.getChildren().addAll(baseLabel, baseInput, numberLabel1, numberInput1, targetBaseBox,
                    actionButton, resultLabel);

            actionButton.setOnAction(e -> convertNumber(baseInput, numberInput1, targetBaseBox, resultLabel));
        }

        else {

            customLayout.getChildren().addAll(baseLabel, baseInput, numberLabel1, numberInput1, numberLabel2,
                    numberInput2, targetBaseBox, actionButton, resultLabel);

            actionButton.setOnAction(e -> performOperation(baseInput, numberInput1, numberInput2, targetBaseBox,
                    resultLabel, operation));
        }

        backButton.setOnAction(e -> openCustomBaseSelection(primaryStage));
        customLayout.getChildren().add(backButton);

        Scene customScene = new Scene(customLayout, 400, 460);
        primaryStage.setScene(customScene);
    }

    /********************************************
     * 
     * This is also Second Display
     * When press button then Third Display Open
     * Third Display For Custom Base
     * 
     ********************************************/

    private void openDefaultBaseWindow(Stage primaryStage, String operation) {
        VBox defaultLayout = new VBox(15);
        defaultLayout.setPadding(new Insets(20));
        defaultLayout.setAlignment(Pos.CENTER);
        defaultLayout.setStyle("-fx-background-color: #e0ffff;");

        ComboBox<String> fromBox = new ComboBox<>();
        fromBox.getItems().addAll("Binary", "Decimal", "Octal", "Hexadecimal");
        fromBox.setPromptText("From");

        fromBox.setStyle(
                "-fx-font-size: 17px; " +
                        "-fx-font-family: 'Arial Rounded MT Bold'; " +
                        "-fx-text-fill: #0D47A1;");

        ComboBox<String> toBox = new ComboBox<>();
        toBox.getItems().addAll("Binary", "Decimal", "Octal", "Hexadecimal");
        toBox.setPromptText("To");

        toBox.setStyle(
                "-fx-font-size: 17px; " +
                        "-fx-font-family: 'Arial Rounded MT Bold'; " +
                        "-fx-text-fill: #0D47A1;");

        TextField numberInput1 = new TextField();
        numberInput1.setPromptText("Enter first number");

        numberInput1.setStyle("-fx-font-size: 17px; " +
                "-fx-font-family: 'Arial Rounded MT Bold'; " +
                "-fx-text-fill: blue;");

        TextField numberInput2 = new TextField();
        numberInput2.setPromptText("Enter second number (for addition/subtraction)");

        numberInput2.setStyle("-fx-font-size: 17px; " +
                "-fx-font-family: 'Arial Rounded MT Bold'; " +
                "-fx-text-fill: #006400;");

        Label resultLabel = new Label();

        Button actionButton = new Button(operation);
        setButtonStyle(actionButton, "#4CAF50", 25);

        Button backButton = new Button("Back");
        setButtonStyle(backButton, "#f44336", 20);

        if (operation.equals("Convert")) {
            defaultLayout.getChildren().addAll(fromBox, toBox, numberInput1, actionButton, resultLabel);

            actionButton.setOnAction(e -> convertNumber(fromBox, toBox, numberInput1, resultLabel));

        } else {

            defaultLayout.getChildren().addAll(fromBox, toBox, numberInput1, numberInput2, actionButton, resultLabel);

            actionButton.setOnAction(
                    e -> performOperation(fromBox, toBox, numberInput1, numberInput2, resultLabel, operation));

        }

        backButton.setOnAction(e -> openDefaultBaseSelection(primaryStage));
        defaultLayout.getChildren().add(backButton);

        Scene defaultScene = new Scene(defaultLayout, 400, 400);
        primaryStage.setScene(defaultScene);

    }

    /*****************************************************
     * 
     * Styling method to easily set button color and font
     * Button color font and fill change
     * 
     *****************************************************/
    private void setButtonStyle(Button button, String color, int fontSize) {
        button.setStyle("-fx-background-color: " + color + "; -fx-text-fill: white;");
        button.setFont(Font.font("Arial", fontSize));
    }

    /*********************************
     * 
     * 1. performOperation Method:
     * 
     *********************************/

    private void performOperation(TextField baseInput, TextField numberInput1, TextField numberInput2,
            ComboBox<String> targetBaseBox, Label resultLabel, String operation) {
        try {

            int base = Integer.parseInt(baseInput.getText());

            double num1 = parseFractional(numberInput1.getText(), base);

            double num2 = parseFractional(numberInput2.getText(), base);

            double result = operation.equals("Add") ? num1 + num2 : num1 - num2;

            int targetBase = targetBaseBox.getValue().equals("Custom") ? base : getTargetBase(targetBaseBox.getValue());

            resultLabel.setText("Result (" + operation + "): " + convertFractional(result, targetBase));

            resultLabel.setStyle("-fx-font-size: 17px; -fx-text-fill: blue; -fx-font-family: 'Arial Rounded MT Bold';");

        } catch (Exception e) {

            resultLabel.setText("Invalid input or base.");
            resultLabel.setStyle("-fx-font-size: 17px; -fx-text-fill: red; -fx-font-family: 'Arial Rounded MT Bold';");
        }
    }

    /*********************************************
     * 
     * 2. performOperation with ComboBox Method:
     * 
     *********************************************/
    private void performOperation(ComboBox<String> fromBox, ComboBox<String> toBox, TextField numberInput1,
            TextField numberInput2, Label resultLabel, String operation) {
        try {

            int fromBase = getTargetBase(fromBox.getValue());

            double num1 = parseFractional(numberInput1.getText(), fromBase);

            double num2 = parseFractional(numberInput2.getText(), fromBase);

            double result = operation.equals("Add") ? num1 + num2 : num1 - num2;

            int targetBase = getTargetBase(toBox.getValue());

            resultLabel.setText("Result (" + operation + "): " + convertFractional(result, targetBase));

            resultLabel.setStyle("-fx-font-size: 17px; -fx-text-fill: blue; -fx-font-family: 'Arial Rounded MT Bold';");

        } catch (Exception e) {

            resultLabel.setText("Invalid input or base.");

            resultLabel.setStyle("-fx-font-size: 17px; -fx-text-fill: red; -fx-font-family: 'Arial Rounded MT Bold';");

        }
    }

    /***********************************************
     * 
     * Convert text field string to Double number
     * 
     ***********************************************/

    private double parseFractional(String number, int base) {

        String[] parts = number.split("\\.");

        int integerPart = Integer.parseInt(parts[0], base);

        double fractionalPart = 0;

        if (parts.length > 1) {

            for (int i = 0; i < parts[1].length(); i++) {

                int digitValue = Character.digit(parts[1].charAt(i), base);

                fractionalPart += digitValue / Math.pow(base, i + 1);
            }
        }

        return integerPart + fractionalPart;

    }

    /**********************************
     * 
     * Fractional number calculation
     *
     **********************************/

    private String convertFractional(double number, int base) {

        int integerPart = (int) number;

        double fractionalPart = number - integerPart;

        String integerResult = Integer.toString(integerPart, base).toUpperCase();

        StringBuilder fractionalResult = new StringBuilder(".");

        for (int i = 0; i < 10; i++) {

            fractionalPart *= base;

            int digitValue = (int) fractionalPart;

            fractionalResult.append(Character.forDigit(digitValue, base));

            fractionalPart -= digitValue;

            if (fractionalPart == 0)
                break;
        }

        return integerResult + fractionalResult.toString().toUpperCase();

    }

    /********************************************
     * 
     * 3. convertNumber Method with TextField:
     * 
     ********************************************/

    private void convertNumber(TextField baseInput, TextField numberInput, ComboBox<String> targetBaseBox,
            Label resultLabel) {

        try {

            int base = Integer.parseInt(baseInput.getText());

            double number = parseFractional(numberInput.getText(), base);

            int targetBase = targetBaseBox.getValue().equals("Custom") ? base : getTargetBase(targetBaseBox.getValue());

            resultLabel.setText("Converted Value: " + convertFractional(number, targetBase));

            resultLabel.setStyle("-fx-font-size: 17px; -fx-text-fill: blue; -fx-font-family: 'Arial Rounded MT Bold';");

        } catch (Exception e) {

            resultLabel.setText("Invalid input or base.");

            resultLabel.setStyle("-fx-font-size: 17px; -fx-text-fill: red; -fx-font-family: 'Arial Rounded MT Bold';");
        }

    }

    /********************************************
     * 
     * 4. convertNumber Method with ComboBox:
     * 
     ********************************************/

    private void convertNumber(ComboBox<String> fromBox, ComboBox<String> toBox, TextField numberInput,
            Label resultLabel) {

        try {

            int fromBase = getTargetBase(fromBox.getValue());

            double number = parseFractional(numberInput.getText(), fromBase);

            int targetBase = getTargetBase(toBox.getValue());

            resultLabel.setText("Converted Value: " + convertFractional(number, targetBase));

            resultLabel.setStyle("-fx-font-size: 17px; -fx-text-fill: blue; -fx-font-family: 'Arial Rounded MT Bold';");
        } catch (Exception e) {

            resultLabel.setText("Invalid input or base.");

            resultLabel.setStyle("-fx-font-size: 17px; -fx-text-fill: red; -fx-font-family: 'Arial Rounded MT Bold';");
        }

    }

    /************************
     * 
     * Target Base
     * 
     ***********************/
    private int getTargetBase(String baseName) {
        return switch (baseName) {
            case "Binary" -> 2;
            case "Octal" -> 8;
            case "Decimal" -> 10;
            case "Hexadecimal" -> 16;
            default -> throw new IllegalArgumentException("Invalid base");
        };
    }

    /*******************
     * 
     * Main Function
     * 
     ******************/
    public static void main(String[] args) {
        launch(args);
    }
}