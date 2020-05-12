function fn() {
     var ValidateResponse = Java.type('KarateApiTesting.ValidateResponse');
     var jd = new ValidateResponse();
     return jd.validateResponseTime(responseTime);
    }