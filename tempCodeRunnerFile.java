 String sDate1=rs.getString(5);
                Date date2=formatter.parse(sDate1);
                int result = date.compareTo(date2);
                if(result > 0) {