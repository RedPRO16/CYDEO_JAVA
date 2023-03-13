package day10_NestedIfTernary;

public class statusCode {
    public static void main(String[] args) {
        int code = 403;
        String result = (code == 200) ? result = "OK" : (code == 201) ? result = "Created" : (code == 202) ? result = "Accepted"
                : (code == 301) ? result = "Moved Permanently" : (code == 303) ? result = "See Others"
                : (code == 304) ? result = "Not Modified" : (code == 307) ? result = "Temporary Redirect"
                : (code == 400) ? result = "Bad request" : (code == 401) ? result = "Unauthorized"
                : (code == 403) ? result = "Forbidden" : (code == 404) ? result = "Not Found"
                : (code == 410) ? result = "Gone" : (code == 500) ? result = "Internal Server Error"
                : "Service Unavailable";

        System.out.println("result = " + result);
    }
}


/*
HTTP is the protocol that governs communications between web-servers and web clients. Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status codes and their meanings:
	                200, OK
	                201, Created
	                202, Accepted
	                301, Moved Permanently
	                303, See Other
	                304, Not Modified
	                307, Temporary Redirect
	                400, Bad Request
	                401, Unauthorized
	                403, Forbidden
	                404, Not Found
	                410, Gone
	                500, Internal Server Error
	                503, Service Unavailable


         declare an int variable called statusCode, and a valid status code is already given
         write a program that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok

            NOTE: MUST USE TERNARY.
 */