package lab8;

import java.util.Arrays;

import sun.security.x509.AlgIdDSA;

public class DensePolynomial implements Polynomial{

	private final double [] poly;

	public DensePolynomial() {
		this.poly = new double [1];
	}

	public int getLength() {
		return this.poly.length;
	}



	public double[] getPoly() {
		return poly;
	}

	private DensePolynomial(double coefficient, int degree, double [] polys) {


		//this.poly = new double[degree+1];

		this.poly = new double[polys.length];


		for(int i=0;i<polys.length;i++) {
			this.poly[i] = polys[i];
			//System.out.println("poly[" + i + "] = " + this.poly[i]);
		}













	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(poly);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DensePolynomial other = (DensePolynomial) obj;
		if (!Arrays.equals(poly, other.poly))
			return false;
		return true;
	}

	@Override
	/**
	 * Return a new Polynomial that includes the supplied coefficient and degree
	 * term. If the supplied term is of the same degree as an already existing Term
	 * in this Polynomial, then the coefficients of the supplied and existing terms
	 * are summed in the returned new Polynomial.
	 * 
	 * This Polynomial must not be disturbed by this method. Be sure to return a new
	 * Polynomial that is like this one, but with the extra term included.
	 * 
	 * @param coefficient
	 * @param degree
	 * @return new Polynomial as described above
	 */
	public Polynomial addTerm(double coefficient, int degree){
		// TODO Auto-generated method stub
		//System.out.println("function call");
		if(coefficient != 0) {
			double [] prevCoefficients = this.poly;



			DensePolynomial p = new DensePolynomial (coefficient, degree, CoefficientArrayUtils.createNextCoefficients(coefficient, degree, prevCoefficients));

			return p;
		}
		else {
			DensePolynomial p = new DensePolynomial (coefficient, degree, this.poly);
			return p;
		}


		/*
		if(coefficient != 0) {
			System.out.println("Coefficient triggered | Coefficient = " + coefficient);
			//int loc = 0;


			for(int i=0;i<degree;i++) {
				if(i != 0) {
					loc = i + 1;
				}
			}


			double polyZero [] = new double [degree+1];

			//System.out.println("loc = " + loc);
			polyZero[degree] += coefficient;

			//System.out.println(polyZero[]);

			DensePolynomial p = new DensePolynomial(coefficient, degree, polyZero);









			return p;




		/*
		double [] py = CoefficientArrayUtils.createNextCoefficients(coefficient, degree, poly);


		DensePolynomial p = new DensePolynomial(coefficient, degree, py);

		return p;



		 */






		/*
		DensePolynomial p = new DensePolynomial(coefficient, degree, this.poly);

		System.out.println(p.toString());

		return p;
		 */
	}



	/**
	 * Return the degree of this Polynomial, computed as the highest degree Term of
	 * this Polynomial over all Terms with non-zero coefficients. The degree of all
	 * Polynomials is at least 0, because a Polynomial with no Terms is equivalent
	 * to 0.0 x^0
	 * 
	 * @return the degree of this Polynomial
	 */
	public int degree() {
		int degstore = 0;
		for(int i=0;i<this.poly.length;i++) {
			if(this.poly[i] != 0) {
				degstore = i;
			}
		}


		return degstore;
	}

	/**
	 * Returns the coefficient of the term at the specified degree. If no such term
	 * exists in the Polynomial, 0.0 should be returned.
	 * 
	 * @param degree of interest
	 * @return coefficient of the degree of interest
	 */

	@Override
	public double getCoefficientAtDegree(int degree) {

		int degnew = degree-1;

		//return this.poly[degree-1];


		try {
			return this.poly[degree];
		}
		catch(Exception ArrayIndexOutOfBoundsException){
			return 0.0;
		}



	}

	@Override
	/**
	 * Evaluate this Polynomial at the specified value for x
	 * 
	 * 
	 * 
	 * @param x value of the unknown
	 * @return the sum of all terms evaluated at x
	 */
	public double evaluate(double x) {

		double solution = this.poly[0];

		for (int i=1; i<this.poly.length; i++) {

			if(Math.pow(this.poly[i]*x, i) != 0) {
				solution = solution + (this.poly[i]*(Math.pow(x, i)));

				//System.out.println("X = " + x);

				// System.out.println("Solution " + solution);

				//System.out.println(this.poly[i]*x + " to the power of " + i + " is " + Math.pow(this.poly[i]*x, i));


			}
			else {

			}

			System.out.println();
		}

		return solution;

		/*

		if(this.poly.length == 1) {
			return this.poly [0];
		}

		if(this.poly.length == 2) {
			double solution = x;
			solution = solution - this.poly[1];
			solution = solution/this.poly[1]; 

		}

		if(this.poly.length == 3) {
			double solution = x;
			// constant
			solution = solution - this.poly[1];
			// X
			solution = solution/this.poly[1];
			// X^2
			solution = solution/(Math.sqrt(this.poly[2]));
		}


		return 0.0;
		//getCoefficientAtDegree(x);

		 */





		/*
        double [] flip = new double [this.poly.length];

        for(int i=0;i<this.poly.length;i++) {
        	int flipLength = (this.poly.length-1)-i;
        	flip[flipLength] = this.poly[i];


        	System.out.println("flip[" + flipLength + "] = " + flip[flipLength]);
        }

        double solution = this.poly[0];   
        // Let us evaluate value of 2x3 - 6x2 + 2x - 1 for x = 3 


        double result = poly[0];

        for (int i=1; i<this.poly.length; i++) {
            result = result*x + poly[i];
        }

        return result;
		 */



	}

	@Override
	public Polynomial derivative() {
		// TODO Auto-generated method stub

		if(this.poly.length == 1) {
			double [] poly = {0.0};
			DensePolynomial p = new DensePolynomial(0, 1, poly);

			return p;
		}

		if(this.poly.length == 2) {

			double [] derivativemonomial = new double [this.poly.length];

			derivativemonomial[0] = this.poly[1];



			DensePolynomial p = new DensePolynomial(0, 1, derivativemonomial);

			return p;
		}

		double [] derivatives = new double [this.poly.length]; 
		for(int i=2;i<this.poly.length;i++) {

			if(i-1>0) {

				derivatives[i-1] = this.poly[i]*i;

			}
			derivatives[0] = this.poly[1];

			// 2x^2 > 4x > 4 > 0
		}
		DensePolynomial p = new DensePolynomial(0, 1, derivatives);
		return p;
	}

	/**
	 * Return a new Polynomial that is the sum of this one and the other one. Be
	 * sure not to disturb this Polynomial.
	 * 
	 * @param other another Polynomial
	 * @return the sum of this and the other Polynomial
	 */
	@Override
	public DensePolynomial sum(Polynomial other) {

		DensePolynomial other2 = (DensePolynomial)other;

		if(this.getLength() == other2.getLength()) {
			double[] sum = new double [this.getLength()];
			for(int i=0;i<other2.getLength();i++) {
				sum[i] = other2.poly[i] + this.poly[i];
			}
			DensePolynomial sumobj = new DensePolynomial(0, 1, sum);

			return sumobj;

		}

		if(this.getLength() > other2.getLength()) {
			double[] sum2 = new double [this.getLength()];

			for(int i=0;i<this.getLength();i++) {
				try {
					sum2[i] = other2.poly[i] + this.poly[i];
				}
				catch(Exception ArrayIndexOutOfBoundsException) {
					sum2[i] = this.poly[i];
				}

			}

			DensePolynomial sumobj = new DensePolynomial(0, 1, sum2);

			return sumobj;

		}
		if(this.getLength() < other2.getLength()) {
			double[] sum3 = new double [other2.poly.length];

			for(int i=0;i<other2.getLength();i++) {
				try {
					sum3[i] = other2.poly[i] + this.poly[i];
				}
				catch(Exception ArrayIndexOutOfBoundsException) {
					sum3[i] = other2.poly[i];
				}

			}

			DensePolynomial sumobj = new DensePolynomial(0, 1, sum3);

			return sumobj;

		}
		/*
		if(this.getLength() < other2.getLength()) {
			double[] sum = new double [other2.getLength()];
			for(int i=0;i<other2.getLength();i++) {
				sum[i] = other2.poly[i] + this.poly[i];
			}
		}
		 */
		return other2;

	}

	@Override
	public String toString() {

		String statement = "DensePolynomial [poly= ";

		for(int i=1;i<this.poly.length;i++) {

			if(i == 1) {
				statement += " " + this.poly[i] + "x ";
			}

			statement += " " + this.poly[i] + "x^" + i;
		}	

		statement += this.poly[0];

		return statement;



		// + " x degrees = " + this.getLength() + "]";
	}










}
