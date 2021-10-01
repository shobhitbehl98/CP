#include<bits/stdc++.h>
#define ll long long
#define pb push_back
#define fr(a,b) for(int i = a; i < b; i++)
#define rep(i,a,b) for(int i = a; i < b; i++)
#define mod 1000000007
#define inf (1LL<<60)
#define all(x) (x).begin(), (x).end()
#define prDouble(x) cout << fixed << setprecision(10) << x
#define triplet pair<ll,pair<ll,ll>>
#define goog(tno) cout << "Case #" << tno <<": "
#define fast_io ios_base::sync_with_stdio(false);cin.tie(NULL)
#define read(x) int x; cin >> x
using namespace std;
 
int main() {
   fast_io;
   int t = 1; cin >> t;
   while(t--){
        int arr[3];
        int sum=0;
        cin>>arr[0]>>arr[1]>>arr[2];
        int b;
        cin>>b;
        int ans=0;
        int i=0;
        while(i<3){
        //    cout<<ans<<" "<<sum<<" "<<i<<endl; 
           if(sum+arr[i]<b){
               sum+=arr[i];
               i++;
           }else{
               if(sum+arr[i]>b&&arr[i]>b){
                   i++;
               }else if(sum+arr[i]==b){
                   i++;
               }
               ans++;
               sum=0;
           }
        }
        if(sum>0){
            ans++;
        }
        cout<<ans<<endl;

   }
   return 0;
}