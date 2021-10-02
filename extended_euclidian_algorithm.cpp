#include<bits/stdc++.h>
#define ll long long
#define pb push_back
#define fr(a,b) for(int i = a; i < b; i++)
#define rep(i,a,b) for(int i = a; i < b; i++)
#define mod 1000000007
#define inf (1LL<<60)
#define all(x) (x).begin(), (x).end()
#define prDouble(x) cout << fixed << setprecision(10) << x
// #define triplet pair<ll,pair<ll,ll>>
#define goog(tno) cout << "Case #" << tno <<": "
#define fast_io ios_base::sync_with_stdio(false);cin.tie(NULL)
#define read(x) int x; cin >> x
using namespace std;

struct triplet{
    int gcd;
    int x;
    int y;
};
triplet ext(int a,int b){
    if(b==0){
        triplet base;
        base.x=1;
        base.y=0;
        base.gcd=a;
        return base;
    }

    triplet small=ext(b,a%b);
    triplet fans;
    fans.x=small.y;
    fans.y=small.x-((a/b)*small.y);
    fans.gcd=small.gcd;
    return fans;
}
int main() {
   fast_io;
   int a,b;
   cin>>a>>b;
    triplet e=ext(a,b);
    cout<<e.x<<" "<<e.y<<" "<<e.gcd;
   return 0; 
   
}