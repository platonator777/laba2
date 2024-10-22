public class ManWithName {
        private Name name;
        private int height;
        private ManWithName father;


        ManWithName(Name name, int height, ManWithName father) {
            this.name = name;
            this.height = height;
            this.father = father;

            if (this.name.getLastName() == null && father != null && father.name.getLastName() != null) {
                this.name = new Name(father.name.getLastName(), this.name.getFirstName(), this.name.getMiddleName());
            }

            if (this.name.getMiddleName() == null && father != null && father.name.getFirstName() != null) {
                this.name = new Name(this.name.getLastName(), this.name.getFirstName(), father.name.getFirstName() + "ович");
            }
        }

    public ManWithName(Name name, int height) {
        this(name, height, null);
    }

        public String toString() {
            return name + ", рост: " + height;
        }
    }