package com.damianpawelczyk;

import io.micronaut.http.annotation.*;

@Controller("/jobApplications")
public class JobApplicationsController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}