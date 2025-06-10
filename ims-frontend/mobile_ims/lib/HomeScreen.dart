import 'package:flutter/material.dart';
import 'package:mobile_ims/Inventory/screens/inventoryScreen.dart';

class HomeScreen extends StatelessWidget {
  const HomeScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Dashboard'),
        backgroundColor: Colors.greenAccent[400],
        centerTitle: true,
      ),
      body: Center(
        child: Column(
          //mainAxisAlignment: MainAxisAlignment.spaceEvenly,
          children: [
            Container(
              margin: const EdgeInsets.fromLTRB(0, 40, 0, 30),
              height: 300,
              child: InkWell(
                onTap: () {
                  Navigator.push(
                    context,
                    MaterialPageRoute(
                      builder: (context) => const InventoryScreen(),
                    ),
                  );
                },
                child: Card(
                  color: Colors.greenAccent[100],
                  shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(10.0),
                  ),
                  margin: EdgeInsets.all(16.0),
                  borderOnForeground: false,
                  clipBehavior: Clip.antiAlias,
                  semanticContainer: true,
                  shadowColor: Colors.red,
                  child: Column(
                    children: [
                      ListTile(leading: Icon(Icons.inventory)),
                      ListTile(title: const Text("Inventory Mangement")),
                    ],
                  ),
                ),
              ),
            ),
          ],
        ),
      ),
    );
  }
}
