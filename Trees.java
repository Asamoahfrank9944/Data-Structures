public class Trees {
    public static void main(String[] args)
        {
            Array_imp obj = new Array_imp();
            obj.Root("A");

            // obj.set_Left("B", 0);
            obj.set_Right("B", 0);

            // obj.set_Left("G", 1);
            obj.set_Left("G", 1);

            // obj.set_Left("A", 1);
            obj.set_Right("A", 1);

            // obj.set_Left("F", 2);
            obj.set_Left("F", 2);
            obj.print_Tree();
        }
    }

    class Array_imp {
        static String[] str = new String[10];

        // CREATE ROOT
        public void Root(String key)
        {
            str[0] = key;
        }

        //CREATE LEFT CHILD OF THE TOOT
        public void set_Left(String key, int root)
        {
            int t = (root * 2) + 1;

            if (str[root] == null) {
                System.out.printf("Can't set child at %d, no parent found\n", t);
            }
            else {
                str[t] = key;
            }
        }

        //CREATE RIGHT CHILD OF THE ROOT
        public void set_Right(String key, int root)
        {
            int t = (root * 2) + 2;

            if (str[root] == null) {
                System.out.printf("Can't set child at %d, no parent found\n", t);
            }
            else {
                str[t] = key;
            }
        }

        public void print_Tree()
        {
            for (int i = 0; i < 10; i++) {
                if (str[i] != null)
                    System.out.print(str[i]);
                else
                    System.out.print("----");
            }
        }
    }

