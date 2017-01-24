    public void handleRequest(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        res.setContentType("text/plain");

        Enumeration<String> parameterNames = req.getParameterNames();

        while (parameterNames.hasMoreElements()) {
            String paramName = parameterNames.nextElement();
            out.write(paramName);
            out.write(" ");

            String[] paramValues = req.getParameterValues(paramName);
            for (int i = 0; i < paramValues.length; i++) {
                    String paramValue = paramValues[i];
                    out.write(" " + paramValue);
                    out.write(" ");
            }

        }

        out.close();
    }
