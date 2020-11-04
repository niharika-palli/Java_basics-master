
    class Rectangle extends Shape {
        protected double width;
        protected double length;
        protected double height;

        Rectangle() {
            width = 0.0;
            length = 0.0;
            height = 0.0;
        }

        Rectangle(double width, double length, double height) {
            this.width = width;
            this.length = length;
            this.height = height;
        }

        Rectangle(String color, boolean filled, double width, double length, double height) {
            super(color, filled);
            this.width = width;
            this.length = length;
            this.height = height;

        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getArea() {
            try {
                width=0;
                if (width==0||length==0){
                    throw new InvalidinputException();
                }
                else{
                    double area=length*width;
                }


            }
                catch (InvalidinputException ex)
            {
                System.out.println("enter valid inputs");
            }
            return 0;
        }

        public double getPerimeter() {
            return 2 * (width + length);
        }

        public String toString() {
            return null;
        }
    }
//}

