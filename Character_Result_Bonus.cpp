
#include <iostream>
using namespace std;

int main()
{
    int i, j, kn, l, a, k, b, y, s;

    //  character counters   =>     a = ayaka , k = kazuha , b = baal , y = yoimiya , s = kokomi
    //  choice counters      =>     i = q1_choice , j = q2_choice , kn = q3_choice , l = q4_choice

    cout << "\n";
    cout << "Result Format =>\n\n(Q1-choice Q2-choice Q3-choice Q4-choice) Result-Character\n\n";

    for (i = 1; i <= 3; i++)
    {
        for (j = 1; j <= 3; j++)
        {
            for (kn = 1; kn <= 2; kn++)
                for (l = 1; l <= 2; l++)
                {
                    a = k = b = y = s = 0;

                    switch (i)
                    { case 1:
                      { a += 3; s += 3; break; }//s //a
                      case 2:
                      { b += 3; break;}//b
                      case 3:
                      { k += 3; y += 3; break; }//k //y
                    }

                    switch (j)
                    { case 1:
                      { b += 3; break; }//b
                      case 2:
                      { k += 3; a += 3; break; }//k
                      case 3:
                      { s += 3; a += 3; y += 2; break; }//s //a //y
                    }

                    switch (kn)
                    { case 1:
                      { a += 3; b += 3; break; }//a //b
                      case 2:
                      { k += 3; y += 3; break; }//s //k //y
                    }
  
                    switch (l)
                    { case 1:
                      { a += 3; break; }//a 
                      case 2:
                      { k += 2; y += 2; s += 2; break; }//s //k
                    }


                    if (a >= k && a >= b && a >= y && a >= s)
                        { cout <<"("<< i << j << kn << l <<")"<< " a     ";}
                    else if (k >= a && k >= b && k >= y && k >= s)
                        { cout <<"("<< i << j << kn << l <<")"<< " k     ";}
                    else if (b >= a && b >= k && b >= y && b >= s)
                        { cout <<"("<< i << j << kn << l <<")"<< " b     ";}
                    else if (y >= a && y >= k && y >= b && y >= s)
                        { cout <<"("<< i << j << kn << l <<")"<< " y     ";}
                    else if (s >= a && s >= k && s >= b && s >= y)
                        { cout <<"("<< i << j << kn << l <<")"<< " s     ";}
                }
         }

        cout << "\n\n";
    }
    return 0;
}
