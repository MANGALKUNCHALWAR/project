public class Employee_wage_problem {
    //***1***Check Employee is Present or Absent
    //- Use ((RANDOM)) for Attendance Check
    public static void main(String[] args) {
        // constants
        int IS_FULL_TIME = 1;
        //computation
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is present");
        } else {
            System.out.println("employee is absent");
        }
    }
}

        //****2****Calculate DailyEmployee Wage - Assume Wage per Hour is 20
        // - Assume Full Day Hour is 8
          //constants
        class Employee {
            public static void main(String[] args) {

                int a = 1;
                int EMP_RATE_PER_HOUR = 20;
                //variables
                int empHrs = 0;
                int empWage = 0;
                //computation
                double empCheck = Math.floor(Math.random() * 10) % 2;
                if (empCheck == a)
                    empHrs = 8;
                else {
                    empHrs = 0;
                    empWage = empHrs * EMP_RATE_PER_HOUR;
                    System.out.println("Emp Wage: " + empWage);
                }

            }
        }


        //****3****Add Part time Employee & Wage - Assume Part time Hour is 8
         class  EmpWage {
            public static void main(String[] args) {
                //constants
                int IS_PART_TIME = 1;
                int IS_FULL_TIME = 2;
                int EMP_RATE_PER_HOUR = 20;
                //variable
                int empHrs = 0;
                int empWage = 0;
                double empCheck = Math.floor(Math.random() * 10) % 3;
                if (empCheck == IS_PART_TIME)
                    empHrs = 4;
                else if (empCheck == IS_FULL_TIME)
                    empHrs = 8;
                else {
                    empHrs = 0;
                    empWage = empHrs * EMP_RATE_PER_HOUR;
                    System.out.println(" Emp Wage: " + empWage);


                }

            }

        }
           //****4****Solving using Switch Case Statement
                class Switch_case {
                public static final int IS_PART_TIME =1;
                public static final int IS_FULL_TIME =2;
                public static final int EMP_RATE_PER_HOUR = 20;

                     public static void main(String[] args) {
                         //variable
                         int empHrs = 0;
                         int empWage = 0;
                         //computation
                         int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                         switch (empCheck) {
                             case IS_PART_TIME:
                                 empHrs = 4;
                             case IS_FULL_TIME:
                                 empHrs = 8;
                             default:
                                 empHrs = 0;
                         }
                         empWage = empHrs * EMP_RATE_PER_HOUR;
                         System.out.println("Emp Wage: " + empWage);
                         }
                     }

                 //*****5***** Calculating Wages for a Month - Assume 20 Working Day per Month

               class WagesForMonth {
                   public static final int IS_PART_TIME = 1;
                   public static final int IS_FULL_TIME = 2;
                   public static final int EMP_RATE_PER_HOUR = 20;
                   public static final int NUM_OF_WORKING_DAYS = 2;

                   public static void main(String[] args) {
                       //variable
                       int empHrs = 0, empWage = 0, totalEmpWage = 0;
                       //computation
                       for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
                           int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                           switch (empCheck) {
                               case IS_PART_TIME:
                                   empHrs = 4;
                               case IS_FULL_TIME:
                                   empHrs = 8;
                                   break;
                               default:
                                   empHrs = 0;
                           }
                           empWage = empHrs * EMP_RATE_PER_HOUR;
                           totalEmpWage += empWage;
                           System.out.println("Emp Wage: " + empWage);
                       }
                       System.out.println("Total Emp Wage: " + totalEmpWage);
                   }
               }
               //****6****Calculate Wages till a condition of total working hours
// or days is reached for a month - Assume 100 hours and 20 days

              class Total_working_hours {
                  public static final int IS_PART_TIME = 1;
                  public static final int IS_FULL_TIME = 2;
                  public static final int EMP_RATE_PER_HOUR = 20;
                  public static final int NUM_OF_WORKING_DAYS = 2;
                  public static final int MAX_HRS_IN_MONTH = 10;

                  public static void main(String[] args) {
                      //variable
                      int empHrs = 0, totalEmpHrs = 0, totalWorkingDay = 0;
                      //computation
                      while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDay < NUM_OF_WORKING_DAYS) {
                          totalWorkingDay++;
                          int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                          switch (empCheck) {
                              case IS_PART_TIME:
                                  empHrs = 4;
                              case IS_FULL_TIME:
                                  empHrs = 8;
                                  break;
                              default:

                                  empHrs = 0;
                          }
                          totalEmpHrs += empHrs;
                          System.out.println("Day#: " + totalWorkingDay + " Emp Hr : " + empHrs);
                      }
                      int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
                      System.out.println("Total Emp Wage: " + totalEmpWage);
                  }

              }































