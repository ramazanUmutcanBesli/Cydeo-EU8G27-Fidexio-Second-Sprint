package com.cydeo.step_definitions;


import com.cydeo.pages.FideoAta;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import org.junit.Test;

import org.openqa.selenium.support.ui.WebDriverWait;


public class FleetMenuCheck {

        FideoAta fideoAta = new FideoAta();
        LoginPage loginPage= new LoginPage();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

        @Given("user click more button")
        public void user_click_more_button() {

        fideoAta.moreButton.click();

}
        @Then("user click Fleet button")
        public void user_click_fleet_button() {
                fideoAta.FleetButton.click();
        }





        @Given("user check Vehicles title")
        public void user_check_vehicles_title() {
                System.out.println("fideoAta.vehiclesTitle.getText() = " + fideoAta.vehiclesButton.getText());

               Assert.assertEquals("Vehicle Model",fideoAta.vehicleModelButton.getText());
        }

        @Given("user check Vehicles Odometer title")
        public void user_check_vehicles_odometer_title() {
                System.out.println("fideoAta.vehiclesOdometerButton.getText() = " + fideoAta.vehiclesOdometerButton.getText());
                Assert.assertEquals("Vehicles Odometer",fideoAta.vehiclesOdometerButton.getText());
        }


        @Given("user check Vehicle Costs title")
        public void user_check_vehicle_costs_title() {
                System.out.println("fideoAta.vehicleCostsButton.getText() = " + fideoAta.vehicleCostsButton.getText());
                Assert.assertEquals("Vehicle Costs",fideoAta.vehicleCostsButton.getText());
        }



        @Given("user check Vehicles Contracts title")
        public void user_check_vehicles_contracts_title() {
                System.out.println("fideoAta.vehicleContractsButton.getText() = " + fideoAta.vehicleContractsButton.getText());
                Assert.assertEquals("Vehicles Contracts",fideoAta.vehicleContractsButton.getText());
        }



        @Given("user check Vehicles Fuel Logs title")
        public void user_check_vehicles_fuel_logs_title() {
                System.out.println("fideoAta.vehicleFuelLogsButton.getText() = " + fideoAta.vehicleFuelLogsButton.getText());
                Assert.assertEquals("Vehicles Fuel Logs",fideoAta.vehicleFuelLogsButton.getText());
        }



        @Given("user check Vehicles Services Logs title")
        public void user_check_vehicles_services_logs_title() {
                System.out.println("fideoAta.vehiclesServicesLogsButton.getText() = " + fideoAta.vehiclesServicesLogsButton.getText());
                Assert.assertEquals("Vehicles Services Logs",fideoAta.vehiclesServicesLogsButton.getText());

        }

        @Given("user check Reporting title")
        public void user_check_reporting_title() {
                System.out.println("fideoAta.ReportingTitle.getText() = " + fideoAta.ReportingTitle.getText());
                Assert.assertEquals("Reporting",fideoAta.ReportingTitle.getText());

        }



        @Given("user check Costs title")
        public void user_check_costs_title() {
                System.out.println("fideoAta.costsButton.getText() = " + fideoAta.costsButton.getText());
                Assert.assertEquals("Costs",fideoAta.costsButton.getText());
        }


        @Given("user check Indicative Costs title")
        public void user_check_indicative_costs_title() {
                System.out.println("fideoAta.indicativeCostsButton.getText() = " + fideoAta.indicativeCostsButton.getText());
                Assert.assertEquals("Indicative Costs",fideoAta.indicativeCostsButton.getText());

        }


        @Given("user check Configuration title")
        public void user_check_configuration_title() {
                System.out.println("fideoAta.configurationTitle.getText() = " + fideoAta.configurationTitle.getText());
                Assert.assertEquals("Configuration",fideoAta.configurationTitle.getText());

        }


        @Given("user check Vehicle Model title")
        public void user_check_vehicle_model_title() {
                System.out.println("fideoAta.vehicleModelButton.getText() = " + fideoAta.vehicleModelButton.getText());
                Assert.assertEquals("Vehicle Model",fideoAta.vehicleModelButton.getText());
        }


        @Given("user check Model make of Vehicle title")
        public void user_check_model_make_of_vehicle_title() {
                System.out.println("fideoAta.modelMakeOfVehicleButton.getText() = " + fideoAta.modelMakeOfVehicleButton.getText());
                Assert.assertEquals("Model make of Vehicle",fideoAta.modelMakeOfVehicleButton.getText());

        }



        @Given("user check Service Types title")
        public void user_check_service_types_title() {
                System.out.println("fideoAta.serviceTypeButton.getText() = " + fideoAta.serviceTypeButton.getText());
                Assert.assertEquals("Service Types",fideoAta.serviceTypeButton.getText());
        }



        @Given("user check Contract Types title")
        public void user_check_contract_types_title() {
                System.out.println("fideoAta.contractTypesButton.getText() = " + fideoAta.contractTypesButton.getText());
                Assert.assertEquals("Contract Types",fideoAta.contractTypesButton.getText());
        }



        @Given("user check Vehicle status title")
        public void user_check_vehicle_status_title() {
                System.out.println("fideoAta.vehicleStatusButton.getText() = " + fideoAta.vehicleStatusButton.getText());
                Assert.assertEquals("Vehicle Status",fideoAta.vehicleStatusButton.getText());
        }



        @Given("user check Vehicle Tags title")
        public void user_check_vehicle_tags_title() {
                System.out.println("fideoAta.vehicleTagsButton.getText() = " + fideoAta.vehicleTagsButton.getText());
                Assert.assertEquals("Vehicle Tags",fideoAta.vehicleTagsButton.getText());
        }





}





