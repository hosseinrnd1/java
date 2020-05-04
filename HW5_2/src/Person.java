public class Person {

        private String name;
        private String username;
        private String password;
        private String address;
        private String phonenumber;
        private String evidence;

        public Person setname(String name) {
            this.name = name;
            return this;
        }

        public String getName() {
            return name;
        }

        public Person setusername(String username) {
            this.username = username;
            return this;
        }

        public String getUsername() {
            return username;
        }

        public Person setpassword(String password) {
            this.password = password;
            return this;
        }

        public String getPassword() {
            return password;
        }

        public Person setaddress(String address) {
            this.address = address;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public Person setphonenumber(String phonenumber) {
            this.phonenumber = phonenumber;
            return this;
        }

        public String getPhonenumber() {
            return phonenumber;
        }

        public Person setevidence(String evidence) {
            this.evidence = evidence;
            return this;
        }

        public String getEvidence() {
            return evidence;
        }

        public String toString() {
            return String.format("you information is %n%s%n%s%n%s%n%s%n%s%n%s%n", getName(), getUsername(), getPassword(), getAddress(), getPhonenumber(), getEvidence());
        }
    }
