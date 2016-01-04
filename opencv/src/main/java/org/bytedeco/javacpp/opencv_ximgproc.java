// Targeted by JavaCPP version 1.2-SNAPSHOT

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_imgcodecs.*;
import static org.bytedeco.javacpp.opencv_videoio.*;
import static org.bytedeco.javacpp.opencv_highgui.*;
import static org.bytedeco.javacpp.opencv_flann.*;
import static org.bytedeco.javacpp.opencv_ml.*;
import static org.bytedeco.javacpp.opencv_features2d.*;
import static org.bytedeco.javacpp.opencv_calib3d.*;

public class opencv_ximgproc extends org.bytedeco.javacpp.presets.opencv_ximgproc {
    static { Loader.load(); }

// Parsed from <opencv2/ximgproc.hpp>

/*
 *  By downloading, copying, installing or using the software you agree to this license.
 *  If you do not agree to this license, do not download, install,
 *  copy or use the software.
 *  
 *  
 *  License Agreement
 *  For Open Source Computer Vision Library
 *  (3 - clause BSD License)
 *  
 *  Redistribution and use in source and binary forms, with or without modification,
 *  are permitted provided that the following conditions are met :
 *  
 *  *Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *  
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *  this list of conditions and the following disclaimer in the documentation
 *  and / or other materials provided with the distribution.
 *  
 *  * Neither the names of the copyright holders nor the names of the contributors
 *  may be used to endorse or promote products derived from this software
 *  without specific prior written permission.
 *  
 *  This software is provided by the copyright holders and contributors "as is" and
 *  any express or implied warranties, including, but not limited to, the implied
 *  warranties of merchantability and fitness for a particular purpose are disclaimed.
 *  In no event shall copyright holders or contributors be liable for any direct,
 *  indirect, incidental, special, exemplary, or consequential damages
 *  (including, but not limited to, procurement of substitute goods or services;
 *  loss of use, data, or profits; or business interruption) however caused
 *  and on any theory of liability, whether in contract, strict liability,
 *  or tort(including negligence or otherwise) arising in any way out of
 *  the use of this software, even if advised of the possibility of such damage.
 */

// #ifndef __OPENCV_XIMGPROC_HPP__
// #define __OPENCV_XIMGPROC_HPP__

// #include "ximgproc/edge_filter.hpp"
// #include "ximgproc/disparity_filter.hpp"
// #include "ximgproc/sparse_match_interpolator.hpp"
// #include "ximgproc/structured_edge_detection.hpp"
// #include "ximgproc/seeds.hpp"
// #include "ximgproc/segmentation.hpp"
// #include "ximgproc/fast_hough_transform.hpp"
// #include "ximgproc/estimated_covariance.hpp"
// #include "ximgproc/slic.hpp"
// #include "ximgproc/lsc.hpp"

/** \defgroup ximgproc Extended Image Processing
  \{
    \defgroup ximgproc_edge Structured forests for fast edge detection
<p>
This module contains implementations of modern structured edge detection algorithms, i.e. algorithms
which somehow takes into account pixel affinities in natural images.
    <p>
    \defgroup ximgproc_filters Filters
    <p>
    \defgroup ximgproc_superpixel Superpixels
    <p>
    \defgroup ximgproc_segmentation Image segmentation
  \}
*/
    @Namespace("cv::ximgproc") public static native void niBlackThreshold( @ByVal Mat _src, @ByVal Mat _dst, double maxValue,
                int type, int blockSize, double delta );

 // namespace ximgproc
 //namespace cv

// #endif


// Parsed from opencv2/ximgproc/edge_filter.hpp

/*
 *  By downloading, copying, installing or using the software you agree to this license.
 *  If you do not agree to this license, do not download, install,
 *  copy or use the software.
 *
 *
 *  License Agreement
 *  For Open Source Computer Vision Library
 *  (3 - clause BSD License)
 *
 *  Redistribution and use in source and binary forms, with or without modification,
 *  are permitted provided that the following conditions are met :
 *
 *  *Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *  this list of conditions and the following disclaimer in the documentation
 *  and / or other materials provided with the distribution.
 *
 *  * Neither the names of the copyright holders nor the names of the contributors
 *  may be used to endorse or promote products derived from this software
 *  without specific prior written permission.
 *
 *  This software is provided by the copyright holders and contributors "as is" and
 *  any express or implied warranties, including, but not limited to, the implied
 *  warranties of merchantability and fitness for a particular purpose are disclaimed.
 *  In no event shall copyright holders or contributors be liable for any direct,
 *  indirect, incidental, special, exemplary, or consequential damages
 *  (including, but not limited to, procurement of substitute goods or services;
 *  loss of use, data, or profits; or business interruption) however caused
 *  and on any theory of liability, whether in contract, strict liability,
 *  or tort(including negligence or otherwise) arising in any way out of
 *  the use of this software, even if advised of the possibility of such damage.
 */

// #ifndef __OPENCV_EDGEFILTER_HPP__
// #define __OPENCV_EDGEFILTER_HPP__
// #ifdef __cplusplus

// #include <opencv2/core.hpp>

/** \addtogroup ximgproc_filters
 *  \{ */

/** enum cv::ximgproc::EdgeAwareFiltersList */
public static final int
    DTF_NC = 0,
    DTF_IC = 1,
    DTF_RF = 2,

    GUIDED_FILTER = 3,
    AM_FILTER = 4;


/** \brief Interface for realizations of Domain Transform filter.
<p>
For more details about this filter see \cite Gastal11 .
 */
@Namespace("cv::ximgproc") public static class DTFilter extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DTFilter(Pointer p) { super(p); }


    /** \brief Produce domain transform filtering operation on source image.
    <p>
    @param src filtering image with unsigned 8-bit or floating-point 32-bit depth and up to 4 channels.
    <p>
    @param dst destination image.
    <p>
    @param dDepth optional depth of the output image. dDepth can be set to -1, which will be equivalent
    to src.depth().
     */
    public native void filter(@ByVal Mat src, @ByVal Mat dst, int dDepth/*=-1*/);
    public native void filter(@ByVal Mat src, @ByVal Mat dst);
}

/** \brief Factory method, create instance of DTFilter and produce initialization routines.
<p>
@param guide guided image (used to build transformed distance, which describes edge structure of
guided image).
<p>
@param sigmaSpatial \f${\sigma}_H\f$ parameter in the original article, it's similar to the sigma in the
coordinate space into bilateralFilter.
<p>
@param sigmaColor \f${\sigma}_r\f$ parameter in the original article, it's similar to the sigma in the
color space into bilateralFilter.
<p>
@param mode one form three modes DTF_NC, DTF_RF and DTF_IC which corresponds to three modes for
filtering 2D signals in the article.
<p>
@param numIters optional number of iterations used for filtering, 3 is quite enough.
<p>
For more details about Domain Transform filter parameters, see the original article \cite Gastal11 and
[Domain Transform filter homepage](http://www.inf.ufrgs.br/~eslgastal/DomainTransform/).
 */
@Namespace("cv::ximgproc") public static native @Ptr DTFilter createDTFilter(@ByVal Mat guide, double sigmaSpatial, double sigmaColor, int mode/*=cv::ximgproc::DTF_NC*/, int numIters/*=3*/);
@Namespace("cv::ximgproc") public static native @Ptr DTFilter createDTFilter(@ByVal Mat guide, double sigmaSpatial, double sigmaColor);

/** \brief Simple one-line Domain Transform filter call. If you have multiple images to filter with the same
guided image then use DTFilter interface to avoid extra computations on initialization stage.
<p>
@param guide guided image (also called as joint image) with unsigned 8-bit or floating-point 32-bit
depth and up to 4 channels.
@param src filtering image with unsigned 8-bit or floating-point 32-bit depth and up to 4 channels.
@param dst
@param sigmaSpatial \f${\sigma}_H\f$ parameter in the original article, it's similar to the sigma in the
coordinate space into bilateralFilter.
@param sigmaColor \f${\sigma}_r\f$ parameter in the original article, it's similar to the sigma in the
color space into bilateralFilter.
@param mode one form three modes DTF_NC, DTF_RF and DTF_IC which corresponds to three modes for
filtering 2D signals in the article.
@param numIters optional number of iterations used for filtering, 3 is quite enough.
\sa bilateralFilter, guidedFilter, amFilter
 */
@Namespace("cv::ximgproc") public static native void dtFilter(@ByVal Mat guide, @ByVal Mat src, @ByVal Mat dst, double sigmaSpatial, double sigmaColor, int mode/*=cv::ximgproc::DTF_NC*/, int numIters/*=3*/);
@Namespace("cv::ximgproc") public static native void dtFilter(@ByVal Mat guide, @ByVal Mat src, @ByVal Mat dst, double sigmaSpatial, double sigmaColor);

//////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////

/** \brief Interface for realizations of Guided Filter.
<p>
For more details about this filter see \cite Kaiming10 .
 */
@Namespace("cv::ximgproc") public static class GuidedFilter extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GuidedFilter(Pointer p) { super(p); }


    /** \brief Apply Guided Filter to the filtering image.
    <p>
    @param src filtering image with any numbers of channels.
    <p>
    @param dst output image.
    <p>
    @param dDepth optional depth of the output image. dDepth can be set to -1, which will be equivalent
    to src.depth().
     */
    public native void filter(@ByVal Mat src, @ByVal Mat dst, int dDepth/*=-1*/);
    public native void filter(@ByVal Mat src, @ByVal Mat dst);
}

/** \brief Factory method, create instance of GuidedFilter and produce initialization routines.
<p>
@param guide guided image (or array of images) with up to 3 channels, if it have more then 3
channels then only first 3 channels will be used.
<p>
@param radius radius of Guided Filter.
<p>
@param eps regularization term of Guided Filter. \f${eps}^2\f$ is similar to the sigma in the color
space into bilateralFilter.
<p>
For more details about Guided Filter parameters, see the original article \cite Kaiming10 .
 */
@Namespace("cv::ximgproc") public static native @Ptr GuidedFilter createGuidedFilter(@ByVal Mat guide, int radius, double eps);

/** \brief Simple one-line Guided Filter call.
<p>
If you have multiple images to filter with the same guided image then use GuidedFilter interface to
avoid extra computations on initialization stage.
<p>
@param guide guided image (or array of images) with up to 3 channels, if it have more then 3
channels then only first 3 channels will be used.
<p>
@param src filtering image with any numbers of channels.
<p>
@param dst output image.
<p>
@param radius radius of Guided Filter.
<p>
@param eps regularization term of Guided Filter. \f${eps}^2\f$ is similar to the sigma in the color
space into bilateralFilter.
<p>
@param dDepth optional depth of the output image.
<p>
\sa bilateralFilter, dtFilter, amFilter */
@Namespace("cv::ximgproc") public static native void guidedFilter(@ByVal Mat guide, @ByVal Mat src, @ByVal Mat dst, int radius, double eps, int dDepth/*=-1*/);
@Namespace("cv::ximgproc") public static native void guidedFilter(@ByVal Mat guide, @ByVal Mat src, @ByVal Mat dst, int radius, double eps);

//////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////

/** \brief Interface for Adaptive Manifold Filter realizations.
<p>
For more details about this filter see \cite Gastal12 and References_.
<p>
Below listed optional parameters which may be set up with Algorithm::set function.
-   member double sigma_s = 16.0
Spatial standard deviation.
-   member double sigma_r = 0.2
Color space standard deviation.
-   member int tree_height = -1
Height of the manifold tree (default = -1 : automatically computed).
-   member int num_pca_iterations = 1
Number of iterations to computed the eigenvector.
-   member bool adjust_outliers = false
Specify adjust outliers using Eq. 9 or not.
-   member bool use_RNG = true
Specify use random number generator to compute eigenvector or not.
 */
@Namespace("cv::ximgproc") public static class AdaptiveManifoldFilter extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AdaptiveManifoldFilter(Pointer p) { super(p); }

    /** \brief Apply high-dimensional filtering using adaptive manifolds.
    <p>
    @param src filtering image with any numbers of channels.
    <p>
    @param dst output image.
    <p>
    @param joint optional joint (also called as guided) image with any numbers of channels.
     */
    public native void filter(@ByVal Mat src, @ByVal Mat dst, @ByVal(nullValue = "cv::noArray()") Mat joint/*=cv::noArray()*/);
    public native void filter(@ByVal Mat src, @ByVal Mat dst);

    public native void collectGarbage();

    public static native @Ptr AdaptiveManifoldFilter create();

    /** @see setSigmaS */
    public native double getSigmaS();
    /** \copybrief getSigmaS @see getSigmaS */
    public native void setSigmaS(double val);
    /** @see setSigmaR */
    public native double getSigmaR();
    /** \copybrief getSigmaR @see getSigmaR */
    public native void setSigmaR(double val);
    /** @see setTreeHeight */
    public native int getTreeHeight();
    /** \copybrief getTreeHeight @see getTreeHeight */
    public native void setTreeHeight(int val);
    /** @see setPCAIterations */
    public native int getPCAIterations();
    /** \copybrief getPCAIterations @see getPCAIterations */
    public native void setPCAIterations(int val);
    /** @see setAdjustOutliers */
    public native @Cast("bool") boolean getAdjustOutliers();
    /** \copybrief getAdjustOutliers @see getAdjustOutliers */
    public native void setAdjustOutliers(@Cast("bool") boolean val);
    /** @see setUseRNG */
    public native @Cast("bool") boolean getUseRNG();
    /** \copybrief getUseRNG @see getUseRNG */
    public native void setUseRNG(@Cast("bool") boolean val);
}

/** \brief Factory method, create instance of AdaptiveManifoldFilter and produce some initialization routines.
<p>
@param sigma_s spatial standard deviation.
<p>
@param sigma_r color space standard deviation, it is similar to the sigma in the color space into
bilateralFilter.
<p>
@param adjust_outliers optional, specify perform outliers adjust operation or not, (Eq. 9) in the
original paper.
<p>
For more details about Adaptive Manifold Filter parameters, see the original article \cite Gastal12 .
<p>
\note Joint images with CV_8U and CV_16U depth converted to images with CV_32F depth and [0; 1]
color range before processing. Hence color space sigma sigma_r must be in [0; 1] range, unlike same
sigmas in bilateralFilter and dtFilter functions.
*/
@Namespace("cv::ximgproc") public static native @Ptr AdaptiveManifoldFilter createAMFilter(double sigma_s, double sigma_r, @Cast("bool") boolean adjust_outliers/*=false*/);
@Namespace("cv::ximgproc") public static native @Ptr AdaptiveManifoldFilter createAMFilter(double sigma_s, double sigma_r);

/** \brief Simple one-line Adaptive Manifold Filter call.
<p>
@param joint joint (also called as guided) image or array of images with any numbers of channels.
<p>
@param src filtering image with any numbers of channels.
<p>
@param dst output image.
<p>
@param sigma_s spatial standard deviation.
<p>
@param sigma_r color space standard deviation, it is similar to the sigma in the color space into
bilateralFilter.
<p>
@param adjust_outliers optional, specify perform outliers adjust operation or not, (Eq. 9) in the
original paper.
<p>
\note Joint images with CV_8U and CV_16U depth converted to images with CV_32F depth and [0; 1]
color range before processing. Hence color space sigma sigma_r must be in [0; 1] range, unlike same
sigmas in bilateralFilter and dtFilter functions. \sa bilateralFilter, dtFilter, guidedFilter
*/
@Namespace("cv::ximgproc") public static native void amFilter(@ByVal Mat joint, @ByVal Mat src, @ByVal Mat dst, double sigma_s, double sigma_r, @Cast("bool") boolean adjust_outliers/*=false*/);
@Namespace("cv::ximgproc") public static native void amFilter(@ByVal Mat joint, @ByVal Mat src, @ByVal Mat dst, double sigma_s, double sigma_r);

//////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////

/** \brief Applies the joint bilateral filter to an image.
<p>
@param joint Joint 8-bit or floating-point, 1-channel or 3-channel image.
<p>
@param src Source 8-bit or floating-point, 1-channel or 3-channel image with the same depth as joint
image.
<p>
@param dst Destination image of the same size and type as src .
<p>
@param d Diameter of each pixel neighborhood that is used during filtering. If it is non-positive,
it is computed from sigmaSpace .
<p>
@param sigmaColor Filter sigma in the color space. A larger value of the parameter means that
farther colors within the pixel neighborhood (see sigmaSpace ) will be mixed together, resulting in
larger areas of semi-equal color.
<p>
@param sigmaSpace Filter sigma in the coordinate space. A larger value of the parameter means that
farther pixels will influence each other as long as their colors are close enough (see sigmaColor ).
When d\>0 , it specifies the neighborhood size regardless of sigmaSpace . Otherwise, d is
proportional to sigmaSpace .
<p>
@param borderType
<p>
\note bilateralFilter and jointBilateralFilter use L1 norm to compute difference between colors.
<p>
\sa bilateralFilter, amFilter
*/
@Namespace("cv::ximgproc") public static native void jointBilateralFilter(@ByVal Mat joint, @ByVal Mat src, @ByVal Mat dst, int d, double sigmaColor, double sigmaSpace, int borderType/*=cv::BORDER_DEFAULT*/);
@Namespace("cv::ximgproc") public static native void jointBilateralFilter(@ByVal Mat joint, @ByVal Mat src, @ByVal Mat dst, int d, double sigmaColor, double sigmaSpace);

//////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////

/** \brief Applies the rolling guidance filter to an image.
<p>
@param src Source 8-bit or floating-point, 1-channel or 3-channel image.
<p>
@param dst Destination image of the same size and type as src.
<p>
@param d Diameter of each pixel neighborhood that is used during filtering. If it is non-positive,
it is computed from sigmaSpace .
<p>
@param sigmaColor Filter sigma in the color space. A larger value of the parameter means that
farther colors within the pixel neighborhood (see sigmaSpace ) will be mixed together, resulting in
larger areas of semi-equal color.
<p>
@param sigmaSpace Filter sigma in the coordinate space. A larger value of the parameter means that
farther pixels will influence each other as long as their colors are close enough (see sigmaColor ).
When d\>0 , it specifies the neighborhood size regardless of sigmaSpace . Otherwise, d is
proportional to sigmaSpace .
<p>
@param numOfIter Number of iterations of joint edge-preserving filtering applied on the source image.
<p>
@param borderType
<p>
\note  rollingGuidanceFilter uses jointBilateralFilter as the edge-preserving filter.
<p>
\sa jointBilateralFilter, bilateralFilter, amFilter
*/
@Namespace("cv::ximgproc") public static native void rollingGuidanceFilter(@ByVal Mat src, @ByVal Mat dst, int d/*=-1*/, double sigmaColor/*=25*/, double sigmaSpace/*=3*/, int numOfIter/*=4*/, int borderType/*=cv::BORDER_DEFAULT*/);
@Namespace("cv::ximgproc") public static native void rollingGuidanceFilter(@ByVal Mat src, @ByVal Mat dst);

//////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////


/** \brief Interface for implementations of Fast Global Smoother filter.
<p>
For more details about this filter see \cite Min2014 and \cite Farbman2008 .
*/
@Namespace("cv::ximgproc") public static class FastGlobalSmootherFilter extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FastGlobalSmootherFilter(Pointer p) { super(p); }

    /** \brief Apply smoothing operation to the source image.
    <p>
    @param src source image for filtering with unsigned 8-bit or signed 16-bit or floating-point 32-bit depth and up to 4 channels.
    <p>
    @param dst destination image.
    */
    public native void filter(@ByVal Mat src, @ByVal Mat dst);
}

/** \brief Factory method, create instance of FastGlobalSmootherFilter and execute the initialization routines.
<p>
@param guide image serving as guide for filtering. It should have 8-bit depth and either 1 or 3 channels.
<p>
@param lambda parameter defining the amount of regularization
<p>
@param sigma_color parameter, that is similar to color space sigma in bilateralFilter.
<p>
@param lambda_attenuation internal parameter, defining how much lambda decreases after each iteration. Normally,
it should be 0.25. Setting it to 1.0 may lead to streaking artifacts.
<p>
@param num_iter number of iterations used for filtering, 3 is usually enough.
<p>
For more details about Fast Global Smoother parameters, see the original paper \cite Min2014. However, please note that
there are several differences. Lambda attenuation described in the paper is implemented a bit differently so do not
expect the results to be identical to those from the paper; sigma_color values from the paper should be multiplied by 255.0 to
achieve the same effect. Also, in case of image filtering where source and guide image are the same, authors
propose to dynamically update the guide image after each iteration. To maximize the performance this feature
was not implemented here.
*/
@Namespace("cv::ximgproc") public static native @Ptr FastGlobalSmootherFilter createFastGlobalSmootherFilter(@ByVal Mat guide, double lambda, double sigma_color, double lambda_attenuation/*=0.25*/, int num_iter/*=3*/);
@Namespace("cv::ximgproc") public static native @Ptr FastGlobalSmootherFilter createFastGlobalSmootherFilter(@ByVal Mat guide, double lambda, double sigma_color);

/** \brief Simple one-line Fast Global Smoother filter call. If you have multiple images to filter with the same
guide then use FastGlobalSmootherFilter interface to avoid extra computations.
<p>
@param guide image serving as guide for filtering. It should have 8-bit depth and either 1 or 3 channels.
<p>
@param src source image for filtering with unsigned 8-bit or signed 16-bit or floating-point 32-bit depth and up to 4 channels.
<p>
@param dst destination image.
<p>
@param lambda parameter defining the amount of regularization
<p>
@param sigma_color parameter, that is similar to color space sigma in bilateralFilter.
<p>
@param lambda_attenuation internal parameter, defining how much lambda decreases after each iteration. Normally,
it should be 0.25. Setting it to 1.0 may lead to streaking artifacts.
<p>
@param num_iter number of iterations used for filtering, 3 is usually enough.
*/
@Namespace("cv::ximgproc") public static native void fastGlobalSmootherFilter(@ByVal Mat guide, @ByVal Mat src, @ByVal Mat dst, double lambda, double sigma_color, double lambda_attenuation/*=0.25*/, int num_iter/*=3*/);
@Namespace("cv::ximgproc") public static native void fastGlobalSmootherFilter(@ByVal Mat guide, @ByVal Mat src, @ByVal Mat dst, double lambda, double sigma_color);

/** \brief Global image smoothing via L0 gradient minimization.
<p>
@param src source image for filtering with unsigned 8-bit or signed 16-bit or floating-point depth.
<p>
@param dst destination image.
<p>
@param lambda parameter defining the smooth term weight.
<p>
@param kappa parameter defining the increasing factor of the weight of the gradient data term.
<p>
For more details about L0 Smoother, see the original paper \cite xu2011image.
*/
@Namespace("cv::ximgproc") public static native void l0Smooth(@ByVal Mat src, @ByVal Mat dst, double lambda/*=0.02*/, double kappa/*=2.0*/);
@Namespace("cv::ximgproc") public static native void l0Smooth(@ByVal Mat src, @ByVal Mat dst);
/** \} */


// #endif
// #endif


// Parsed from opencv2/ximgproc/disparity_filter.hpp

/*
 *  By downloading, copying, installing or using the software you agree to this license.
 *  If you do not agree to this license, do not download, install,
 *  copy or use the software.
 *
 *
 *  License Agreement
 *  For Open Source Computer Vision Library
 *  (3 - clause BSD License)
 *
 *  Redistribution and use in source and binary forms, with or without modification,
 *  are permitted provided that the following conditions are met :
 *
 *  *Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *  this list of conditions and the following disclaimer in the documentation
 *  and / or other materials provided with the distribution.
 *
 *  * Neither the names of the copyright holders nor the names of the contributors
 *  may be used to endorse or promote products derived from this software
 *  without specific prior written permission.
 *
 *  This software is provided by the copyright holders and contributors "as is" and
 *  any express or implied warranties, including, but not limited to, the implied
 *  warranties of merchantability and fitness for a particular purpose are disclaimed.
 *  In no event shall copyright holders or contributors be liable for any direct,
 *  indirect, incidental, special, exemplary, or consequential damages
 *  (including, but not limited to, procurement of substitute goods or services;
 *  loss of use, data, or profits; or business interruption) however caused
 *  and on any theory of liability, whether in contract, strict liability,
 *  or tort(including negligence or otherwise) arising in any way out of
 *  the use of this software, even if advised of the possibility of such damage.
 */

// #ifndef __OPENCV_DISPARITYFILTER_HPP__
// #define __OPENCV_DISPARITYFILTER_HPP__
// #ifdef __cplusplus

// #include <opencv2/core.hpp>
// #include <opencv2/calib3d.hpp>

/** \addtogroup ximgproc_filters
 *  \{
<p>
/** \brief Main interface for all disparity map filters.
 */
@Namespace("cv::ximgproc") public static class DisparityFilter extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DisparityFilter(Pointer p) { super(p); }


    /** \brief Apply filtering to the disparity map.
    <p>
    @param disparity_map_left disparity map of the left view, 1 channel, CV_16S type. Implicitly assumes that disparity
    values are scaled by 16 (one-pixel disparity corresponds to the value of 16 in the disparity map). Disparity map
    can have any resolution, it will be automatically resized to fit left_view resolution.
    <p>
    @param left_view left view of the original stereo-pair to guide the filtering process, 8-bit single-channel
    or three-channel image.
    <p>
    @param filtered_disparity_map output disparity map.
    <p>
    @param disparity_map_right optional argument, some implementations might also use the disparity map
    of the right view to compute confidence maps, for instance.
    <p>
    @param ROI region of the disparity map to filter. Optional, usually it should be set automatically.
    <p>
    @param right_view optional argument, some implementations might also use the right view of the original
    stereo-pair.
     */
    public native void filter(@ByVal Mat disparity_map_left, @ByVal Mat left_view, @ByVal Mat filtered_disparity_map, @ByVal(nullValue = "cv::Mat()") Mat disparity_map_right/*=cv::Mat()*/, @ByVal(nullValue = "cv::Rect()") Rect ROI/*=cv::Rect()*/, @ByVal(nullValue = "cv::Mat()") Mat right_view/*=cv::Mat()*/);
    public native void filter(@ByVal Mat disparity_map_left, @ByVal Mat left_view, @ByVal Mat filtered_disparity_map);
}

/** \brief Disparity map filter based on Weighted Least Squares filter (in form of Fast Global Smoother that
is a lot faster than traditional Weighted Least Squares filter implementations) and optional use of
left-right-consistency-based confidence to refine the results in half-occlusions and uniform areas.
 */
@Namespace("cv::ximgproc") public static class DisparityWLSFilter extends DisparityFilter {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DisparityWLSFilter(Pointer p) { super(p); }

    /** filter parameters */

    /** \brief Lambda is a parameter defining the amount of regularization during filtering. Larger values force
    filtered disparity map edges to adhere more to source image edges. Typical value is 8000.
     */
    public native double getLambda();
    /** @see getLambda */
    public native void setLambda(double _lambda);
    /** \brief SigmaColor is a parameter defining how sensitive the filtering process is to source image edges.
    Large values can lead to disparity leakage through low-contrast edges. Small values can make the filter too
    sensitive to noise and textures in the source image. Typical values range from 0.8 to 2.0.
     */
    public native double getSigmaColor();
    /** @see getSigmaColor */
    public native void setSigmaColor(double _sigma_color);

    /** confidence-related parameters */

    /** \brief LRCthresh is a threshold of disparity difference used in left-right-consistency check during
    confidence map computation. The default value of 24 (1.5 pixels) is virtually always good enough.
     */
    public native int getLRCthresh();
    /** @see getLRCthresh */
    public native void setLRCthresh(int _LRC_thresh);
    /** \brief DepthDiscontinuityRadius is a parameter used in confidence computation. It defines the size of
    low-confidence regions around depth discontinuities.
     */
    public native int getDepthDiscontinuityRadius();
    /** @see getDepthDiscontinuityRadius */
    public native void setDepthDiscontinuityRadius(int _disc_radius);
    /** \brief Get the confidence map that was used in the last filter call. It is a CV_32F one-channel image
    with values ranging from 0.0 (totally untrusted regions of the raw disparity map) to 255.0 (regions containing
    correct disparity values with a high degree of confidence).
     */
    public native @ByVal Mat getConfidenceMap();
    /** \brief Get the ROI used in the last filter call
     */
    public native @ByVal Rect getROI();
}

/** \brief Convenience factory method that creates an instance of DisparityWLSFilter and sets up all the relevant
filter parameters automatically based on the matcher instance. Currently supports only StereoBM and StereoSGBM.
<p>
@param matcher_left stereo matcher instance that will be used with the filter
*/
@Namespace("cv::ximgproc") public static native @Ptr DisparityWLSFilter createDisparityWLSFilter(@Ptr StereoMatcher matcher_left);

/** \brief Convenience method to set up the matcher for computing the right-view disparity map
that is required in case of filtering with confidence.
<p>
@param matcher_left main stereo matcher instance that will be used with the filter
*/
@Namespace("cv::ximgproc") public static native @Ptr StereoMatcher createRightMatcher(@Ptr StereoMatcher matcher_left);

/** \brief More generic factory method, create instance of DisparityWLSFilter and execute basic
initialization routines. When using this method you will need to set-up the ROI, matchers and
other parameters by yourself.
<p>
@param use_confidence filtering with confidence requires two disparity maps (for the left and right views) and is
approximately two times slower. However, quality is typically significantly better.
*/
@Namespace("cv::ximgproc") public static native @Ptr DisparityWLSFilter createDisparityWLSFilterGeneric(@Cast("bool") boolean use_confidence);

//////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////

/** \brief Function for reading ground truth disparity maps. Supports basic Middlebury
and MPI-Sintel formats. Note that the resulting disparity map is scaled by 16.
<p>
@param src_path path to the image, containing ground-truth disparity map
<p>
@param dst output disparity map, CV_16S depth
<p>
\result returns zero if successfully read the ground truth
 */
@Namespace("cv::ximgproc") public static native int readGT(@Str BytePointer src_path,@ByVal Mat dst);
@Namespace("cv::ximgproc") public static native int readGT(@Str String src_path,@ByVal Mat dst);

/** \brief Function for computing mean square error for disparity maps
<p>
@param GT ground truth disparity map
<p>
@param src disparity map to evaluate
<p>
@param ROI region of interest
<p>
\result returns mean square error between GT and src
 */
@Namespace("cv::ximgproc") public static native double computeMSE(@ByVal Mat GT, @ByVal Mat src, @ByVal Rect ROI);

/** \brief Function for computing the percent of "bad" pixels in the disparity map
(pixels where error is higher than a specified threshold)
<p>
@param GT ground truth disparity map
<p>
@param src disparity map to evaluate
<p>
@param ROI region of interest
<p>
@param thresh threshold used to determine "bad" pixels
<p>
\result returns mean square error between GT and src
 */
@Namespace("cv::ximgproc") public static native double computeBadPixelPercent(@ByVal Mat GT, @ByVal Mat src, @ByVal Rect ROI, int thresh/*=24*/);
@Namespace("cv::ximgproc") public static native double computeBadPixelPercent(@ByVal Mat GT, @ByVal Mat src, @ByVal Rect ROI);

/** \brief Function for creating a disparity map visualization (clamped CV_8U image)
<p>
@param src input disparity map (CV_16S depth)
<p>
@param dst output visualization
<p>
@param scale disparity map will be multiplied by this value for visualization
 */
@Namespace("cv::ximgproc") public static native void getDisparityVis(@ByVal Mat src,@ByVal Mat dst,double scale/*=1.0*/);
@Namespace("cv::ximgproc") public static native void getDisparityVis(@ByVal Mat src,@ByVal Mat dst);

/** \} */


// #endif
// #endif


// Parsed from opencv2/ximgproc/sparse_match_interpolator.hpp

/*
 *  By downloading, copying, installing or using the software you agree to this license.
 *  If you do not agree to this license, do not download, install,
 *  copy or use the software.
 *
 *
 *  License Agreement
 *  For Open Source Computer Vision Library
 *  (3 - clause BSD License)
 *
 *  Redistribution and use in source and binary forms, with or without modification,
 *  are permitted provided that the following conditions are met :
 *
 *  *Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *  this list of conditions and the following disclaimer in the documentation
 *  and / or other materials provided with the distribution.
 *
 *  * Neither the names of the copyright holders nor the names of the contributors
 *  may be used to endorse or promote products derived from this software
 *  without specific prior written permission.
 *
 *  This software is provided by the copyright holders and contributors "as is" and
 *  any express or implied warranties, including, but not limited to, the implied
 *  warranties of merchantability and fitness for a particular purpose are disclaimed.
 *  In no event shall copyright holders or contributors be liable for any direct,
 *  indirect, incidental, special, exemplary, or consequential damages
 *  (including, but not limited to, procurement of substitute goods or services;
 *  loss of use, data, or profits; or business interruption) however caused
 *  and on any theory of liability, whether in contract, strict liability,
 *  or tort(including negligence or otherwise) arising in any way out of
 *  the use of this software, even if advised of the possibility of such damage.
 */

// #ifndef __OPENCV_SPARSEMATCHINTERPOLATOR_HPP__
// #define __OPENCV_SPARSEMATCHINTERPOLATOR_HPP__
// #ifdef __cplusplus

// #include <opencv2/core.hpp>

/** \addtogroup ximgproc_filters
 *  \{
<p>
/** \brief Main interface for all filters, that take sparse matches as an
input and produce a dense per-pixel matching (optical flow) as an output.
 */
@Namespace("cv::ximgproc") public static class SparseMatchInterpolator extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseMatchInterpolator(Pointer p) { super(p); }

    /** \brief Interpolate input sparse matches.
    <p>
    @param from_image first of the two matched images, 8-bit single-channel or three-channel.
    <p>
    @param from_points points of the from_image for which there are correspondences in the
    to_image (Point2f vector, size shouldn't exceed 32767)
    <p>
    @param to_image second of the two matched images, 8-bit single-channel or three-channel.
    <p>
    @param to_points points in the to_image corresponding to from_points
    (Point2f vector, size shouldn't exceed 32767)
    <p>
    @param dense_flow output dense matching (two-channel CV_32F image)
     */
    public native void interpolate(@ByVal Mat from_image, @ByVal Mat from_points,
                                         @ByVal Mat to_image, @ByVal Mat to_points,
                                         @ByVal Mat dense_flow);
}

/** \brief Sparse match interpolation algorithm based on modified locally-weighted affine
estimator from \cite Revaud2015 and Fast Global Smoother as post-processing filter.
 */
@Namespace("cv::ximgproc") public static class EdgeAwareInterpolator extends SparseMatchInterpolator {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EdgeAwareInterpolator(Pointer p) { super(p); }

    /** \brief K is a number of nearest-neighbor matches considered, when fitting a locally affine
    model. Usually it should be around 128. However, lower values would make the interpolation
    noticeably faster.
     */
    public native void setK(int _k);
    /** @see setK */
    public native int getK();

    /** \brief Sigma is a parameter defining how fast the weights decrease in the locally-weighted affine
    fitting. Higher values can help preserve fine details, lower values can help to get rid of noise in the
    output flow.
     */
    public native void setSigma(float _sigma);
    /** @see setSigma */
    public native float getSigma();

    /** \brief Lambda is a parameter defining the weight of the edge-aware term in geodesic distance,
    should be in the range of 0 to 1000.
     */
    public native void setLambda(float _lambda);
    /** @see setLambda */
    public native float getLambda();

    /** \brief Sets whether the fastGlobalSmootherFilter() post-processing is employed. It is turned on by
    default.
     */
    public native void setUsePostProcessing(@Cast("bool") boolean _use_post_proc);
    /** @see setUsePostProcessing */
    public native @Cast("bool") boolean getUsePostProcessing();

    /** \brief Sets the respective fastGlobalSmootherFilter() parameter.
     */
    public native void setFGSLambda(float _lambda);
    /** @see setFGSLambda */
    public native float getFGSLambda();

    /** @see setFGSLambda */
    public native void setFGSSigma(float _sigma);
    /** @see setFGSLambda */
    public native float getFGSSigma();
}

/** \brief Factory method that creates an instance of the
EdgeAwareInterpolator.
*/
@Namespace("cv::ximgproc") public static native @Ptr EdgeAwareInterpolator createEdgeAwareInterpolator();

/** \} */


// #endif
// #endif


// Parsed from opencv2/ximgproc/structured_edge_detection.hpp

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                           License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009-2011, Willow Garage Inc., all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_STRUCTURED_EDGE_DETECTION_HPP__
// #define __OPENCV_STRUCTURED_EDGE_DETECTION_HPP__
// #ifdef __cplusplus

/** \file
\date Jun 17, 2014
@author Yury Gitman
 */

// #include <opencv2/core.hpp>

/** \addtogroup ximgproc_edge
 *  \{
<p>
/**
  Helper class for training part of [P. Dollar and C. L. Zitnick. Structured Forests for Fast Edge Detection, 2013].
 */
@Namespace("cv::ximgproc") public static class RFFeatureGetter extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RFFeatureGetter(Pointer p) { super(p); }


    /**
     * This functions extracts feature channels from src.
     * Than StructureEdgeDetection uses this feature space
     * to detect edges.
     *
     * @param src : source image to extract features
     * @param features : output n-channel floating point feature matrix.
     *
     * @param gnrmRad : __rf.options.gradientNormalizationRadius
     * @param gsmthRad : __rf.options.gradientSmoothingRadius
     * @param shrink : __rf.options.shrinkNumber
     * @param outNum : __rf.options.numberOfOutputChannels
     * @param gradNum : __rf.options.numberOfGradientOrientations
     */
    public native void getFeatures(@Const @ByRef Mat src, @ByRef Mat features,
                                         int gnrmRad,
                                         int gsmthRad,
                                         int shrink,
                                         int outNum,
                                         int gradNum);
}

@Namespace("cv::ximgproc") public static native @Ptr RFFeatureGetter createRFFeatureGetter();



/** \brief Class implementing edge detection algorithm from \cite Dollar2013 :
 */
@Namespace("cv::ximgproc") public static class StructuredEdgeDetection extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StructuredEdgeDetection(Pointer p) { super(p); }


    /** \brief The function detects edges in src and draw them to dst.
    <p>
    The algorithm underlies this function is much more robust to texture presence, than common
    approaches, e.g. Sobel
    @param src source image (RGB, float, in [0;1]) to detect edges
    @param dst destination image (grayscale, float, in [0;1]) where edges are drawn
    \sa Sobel, Canny
     */
    public native void detectEdges(@Const @ByRef Mat src, @ByRef Mat dst);
}

/**
* The only constructor
*
* @param model : name of the file where the model is stored
* @param howToGetFeatures : optional object inheriting from RFFeatureGetter.
*                           You need it only if you would like to train your
*                           own forest, pass NULL otherwise
*/
@Namespace("cv::ximgproc") public static native @Ptr StructuredEdgeDetection createStructuredEdgeDetection(@Str BytePointer model,
    @Const @Ptr RFFeatureGetter howToGetFeatures/*=cv::Ptr<cv::ximgproc::RFFeatureGetter>()*/);
@Namespace("cv::ximgproc") public static native @Ptr StructuredEdgeDetection createStructuredEdgeDetection(@Str BytePointer model);
@Namespace("cv::ximgproc") public static native @Ptr StructuredEdgeDetection createStructuredEdgeDetection(@Str String model,
    @Const @Ptr RFFeatureGetter howToGetFeatures/*=cv::Ptr<cv::ximgproc::RFFeatureGetter>()*/);
@Namespace("cv::ximgproc") public static native @Ptr StructuredEdgeDetection createStructuredEdgeDetection(@Str String model);

/** \} */



// #endif
// #endif /* __OPENCV_STRUCTURED_EDGE_DETECTION_HPP__ */


// Parsed from opencv2/ximgproc/seeds.hpp

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                           License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2014, Beat Kueng (beat-kueng@gmx.net), Lukas Vogel, Morten Lysgaard
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_SEEDS_HPP__
// #define __OPENCV_SEEDS_HPP__
// #ifdef __cplusplus

// #include <opencv2/core.hpp>

/** \addtogroup ximgproc_superpixel
 *  \{
<p>
/** \brief Class implementing the SEEDS (Superpixels Extracted via Energy-Driven Sampling) superpixels
algorithm described in \cite VBRV14 .
<p>
The algorithm uses an efficient hill-climbing algorithm to optimize the superpixels' energy
function that is based on color histograms and a boundary term, which is optional. The energy
function encourages superpixels to be of the same color, and if the boundary term is activated, the
superpixels have smooth boundaries and are of similar shape. In practice it starts from a regular
grid of superpixels and moves the pixels or blocks of pixels at the boundaries to refine the
solution. The algorithm runs in real-time using a single CPU.
 */
@Namespace("cv::ximgproc") public static class SuperpixelSEEDS extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SuperpixelSEEDS(Pointer p) { super(p); }


    /** \brief Calculates the superpixel segmentation on a given image stored in SuperpixelSEEDS object.
    <p>
    The function computes the superpixels segmentation of an image with the parameters initialized
    with the function createSuperpixelSEEDS().
     */
    public native int getNumberOfSuperpixels();

    /** \brief Calculates the superpixel segmentation on a given image with the initialized
    parameters in the SuperpixelSEEDS object.
    <p>
    This function can be called again for other images without the need of initializing the
    algorithm with createSuperpixelSEEDS(). This save the computational cost of allocating memory
    for all the structures of the algorithm.
    <p>
    @param img Input image. Supported formats: CV_8U, CV_16U, CV_32F. Image size & number of
    channels must match with the initialized image size & channels with the function
    createSuperpixelSEEDS(). It should be in HSV or Lab color space. Lab is a bit better, but also
    slower.
    <p>
    @param num_iterations Number of pixel level iterations. Higher number improves the result.
    <p>
    The function computes the superpixels segmentation of an image with the parameters initialized
    with the function createSuperpixelSEEDS(). The algorithms starts from a grid of superpixels and
    then refines the boundaries by proposing updates of blocks of pixels that lie at the boundaries
    from large to smaller size, finalizing with proposing pixel updates. An illustrative example
    can be seen below.
    <p>
    ![image](pics/superpixels_blocks2.png)
     */
    public native void iterate(@ByVal Mat img, int num_iterations/*=4*/);
    public native void iterate(@ByVal Mat img);

    /** \brief Returns the segmentation labeling of the image.
    <p>
    Each label represents a superpixel, and each pixel is assigned to one superpixel label.
    <p>
    @param labels_out Return: A CV_32UC1 integer array containing the labels of the superpixel
    segmentation. The labels are in the range [0, getNumberOfSuperpixels()].
    <p>
    The function returns an image with ssthe labels of the superpixel segmentation. The labels are in
    the range [0, getNumberOfSuperpixels()].
     */
    public native void getLabels(@ByVal Mat labels_out);

    /** \brief Returns the mask of the superpixel segmentation stored in SuperpixelSEEDS object.
    <p>
    @param image Return: CV_8UC1 image mask where -1 indicates that the pixel is a superpixel border,
    and 0 otherwise.
    <p>
    @param thick_line If false, the border is only one pixel wide, otherwise all pixels at the border
    are masked.
    <p>
    The function return the boundaries of the superpixel segmentation.
    <p>
    \note
       -   (Python) A demo on how to generate superpixels in images from the webcam can be found at
            opencv_source_code/samples/python2/seeds.py
        -   (cpp) A demo on how to generate superpixels in images from the webcam can be found at
            opencv_source_code/modules/ximgproc/samples/seeds.cpp. By adding a file image as a command
            line argument, the static image will be used instead of the webcam.
        -   It will show a window with the video from the webcam with the superpixel boundaries marked
            in red (see below). Use Space to switch between different output modes. At the top of the
            window there are 4 sliders, from which the user can change on-the-fly the number of
            superpixels, the number of block levels, the strength of the boundary prior term to modify
            the shape, and the number of iterations at pixel level. This is useful to play with the
            parameters and set them to the user convenience. In the console the frame-rate of the
            algorithm is indicated.
    <p>
    ![image](pics/superpixels_demo.png)
     */
    public native void getLabelContourMask(@ByVal Mat image, @Cast("bool") boolean thick_line/*=false*/);
    public native void getLabelContourMask(@ByVal Mat image);
}

/** \brief Initializes a SuperpixelSEEDS object.
<p>
@param image_width Image width.
@param image_height Image height.
@param image_channels Number of channels of the image.
@param num_superpixels Desired number of superpixels. Note that the actual number may be smaller
due to restrictions (depending on the image size and num_levels). Use getNumberOfSuperpixels() to
get the actual number.
@param num_levels Number of block levels. The more levels, the more accurate is the segmentation,
but needs more memory and CPU time.
@param prior enable 3x3 shape smoothing term if \>0. A larger value leads to smoother shapes. prior
must be in the range [0, 5].
@param histogram_bins Number of histogram bins.
@param double_step If true, iterate each block level twice for higher accuracy.
<p>
The function initializes a SuperpixelSEEDS object for the input image. It stores the parameters of
the image: image_width, image_height and image_channels. It also sets the parameters of the SEEDS
superpixel algorithm, which are: num_superpixels, num_levels, use_prior, histogram_bins and
double_step.
<p>
The number of levels in num_levels defines the amount of block levels that the algorithm use in the
optimization. The initialization is a grid, in which the superpixels are equally distributed through
the width and the height of the image. The larger blocks correspond to the superpixel size, and the
levels with smaller blocks are formed by dividing the larger blocks into 2 x 2 blocks of pixels,
recursively until the smaller block level. An example of initialization of 4 block levels is
illustrated in the following figure.
<p>
![image](pics/superpixels_blocks.png)
 */
@Namespace("cv::ximgproc") public static native @Ptr SuperpixelSEEDS createSuperpixelSEEDS(
    int image_width, int image_height, int image_channels,
    int num_superpixels, int num_levels, int prior/*=2*/,
    int histogram_bins/*=5*/, @Cast("bool") boolean double_step/*=false*/);
@Namespace("cv::ximgproc") public static native @Ptr SuperpixelSEEDS createSuperpixelSEEDS(
    int image_width, int image_height, int image_channels,
    int num_superpixels, int num_levels);

/** \} */



// #endif
// #endif


// Parsed from opencv2/ximgproc/segmentation.hpp

/*
By downloading, copying, installing or using the software you agree to this
license. If you do not agree to this license, do not download, install,
copy or use the software.
                          License Agreement
               For Open Source Computer Vision Library
                       (3-clause BSD License)
Copyright (C) 2013, OpenCV Foundation, all rights reserved.
Third party copyrights are property of their respective owners.
Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:
  * Redistributions of source code must retain the above copyright notice,
    this list of conditions and the following disclaimer.
  * Redistributions in binary form must reproduce the above copyright notice,
    this list of conditions and the following disclaimer in the documentation
    and/or other materials provided with the distribution.
  * Neither the names of the copyright holders nor the names of the contributors
    may be used to endorse or promote products derived from this software
    without specific prior written permission.
This software is provided by the copyright holders and contributors "as is" and
any express or implied warranties, including, but not limited to, the implied
warranties of merchantability and fitness for a particular purpose are
disclaimed. In no event shall copyright holders or contributors be liable for
any direct, indirect, incidental, special, exemplary, or consequential damages
(including, but not limited to, procurement of substitute goods or services;
loss of use, data, or profits; or business interruption) however caused
and on any theory of liability, whether in contract, strict liability,
or tort (including negligence or otherwise) arising in any way out of
the use of this software, even if advised of the possibility of such damage.
*/

// #ifndef __OPENCV_XIMGPROC_SEGMENTATION_HPP__
// #define __OPENCV_XIMGPROC_SEGMENTATION_HPP__

// #include <opencv2/core.hpp>
            /** \addtogroup ximgproc_segmentation
             *  \{
                    <p>
                    /** \brief Graph Based Segmentation Algorithm.
                        The class implements the algorithm described in \cite PFF2004 .
                     */
                    @Namespace("cv::ximgproc::segmentation") public static class GraphSegmentation extends Algorithm {
                        static { Loader.load(); }
                        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
                        public GraphSegmentation(Pointer p) { super(p); }
                    
                            /** \brief Segment an image and store output in dst
                                @param src The input image. Any number of channel (1 (Eg: Gray), 3 (Eg: RGB), 4 (Eg: RGB-D)) can be provided
                                @param dst The output segmentation. It's a CV_32SC1 Mat with the same number of cols and rows as input image, with an unique, sequential, id for each pixel.
                            */
                            public native void processImage(@ByVal Mat src, @ByVal Mat dst);

                            public native void setSigma(double sigma);
                            public native double getSigma();

                            public native void setK(float k);
                            public native float getK();

                            public native void setMinSize(int min_size);
                            public native int getMinSize();
                    }

                    /** \brief Creates a graph based segmentor
                        @param sigma The sigma parameter, used to smooth image
                        @param k The k parameter of the algorythm
                        @param min_size The minimum size of segments
                     */
                    @Namespace("cv::ximgproc::segmentation") public static native @Ptr GraphSegmentation createGraphSegmentation(double sigma/*=0.5*/, float k/*=300*/, int min_size/*=100*/);
                    @Namespace("cv::ximgproc::segmentation") public static native @Ptr GraphSegmentation createGraphSegmentation();
            /** \} */

            // Represent an edge between two pixels
            @Namespace("cv::ximgproc::segmentation") public static class Edge extends Pointer {
                static { Loader.load(); }
                /** Default native constructor. */
                public Edge() { super((Pointer)null); allocate(); }
                /** Native array allocator. Access with {@link Pointer#position(int)}. */
                public Edge(int size) { super((Pointer)null); allocateArray(size); }
                /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
                public Edge(Pointer p) { super(p); }
                private native void allocate();
                private native void allocateArray(int size);
                @Override public Edge position(int position) {
                    return (Edge)super.position(position);
                }
            
                    public native int from(); public native Edge from(int from);
                    public native int to(); public native Edge to(int to);
                    public native float weight(); public native Edge weight(float weight);

                    public native @Cast("bool") @Name("operator <") boolean lessThan(@Const @ByRef Edge e);
            }

            // A point in the sets of points
            @Namespace("cv::ximgproc::segmentation") @NoOffset public static class PointSetElement extends Pointer {
                static { Loader.load(); }
                /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
                public PointSetElement(Pointer p) { super(p); }
            
                    public native int p(); public native PointSetElement p(int p);
                    public native int size(); public native PointSetElement size(int size);

                    public PointSetElement() { super((Pointer)null); allocate(); }
                    private native void allocate();

                    public PointSetElement(int p_) { super((Pointer)null); allocate(p_); }
                    private native void allocate(int p_);
            }

            // An object to manage set of points, who can be fusionned
            @Namespace("cv::ximgproc::segmentation") @NoOffset public static class PointSet extends Pointer {
                static { Loader.load(); }
                /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
                public PointSet(Pointer p) { super(p); }
            
                    public PointSet(int nb_elements_) { super((Pointer)null); allocate(nb_elements_); }
                    private native void allocate(int nb_elements_);

                    public native int nb_elements(); public native PointSet nb_elements(int nb_elements);

                    // Return the main point of the point's set
                    public native int getBasePoint(int p);

                    // Join two sets of points, based on their main point
                    public native void joinPoints(int p_a, int p_b);

                    // Return the set size of a set (based on the main point)
                    public native int size(@Cast("unsigned int") int p);

            }

        
    


// #endif


// Parsed from opencv2/ximgproc/fast_hough_transform.hpp

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                           License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2015, Smart Engines Ltd, all rights reserved.
// Copyright (C) 2015, Institute for Information Transmission Problems of the Russian Academy of Sciences (Kharkevich Institute), all rights reserved.
// Copyright (C) 2015, Dmitry Nikolaev, Simon Karpenko, Michail Aliev, Elena Kuznetsova, all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_FAST_HOUGH_TRANSFORM_HPP__
// #define __OPENCV_FAST_HOUGH_TRANSFORM_HPP__
// #ifdef __cplusplus

// #include "opencv2/core.hpp"

/**
* \brief   Specifies the part of Hough space to calculate
* \details The enum specifies the part of Hough space to calculate. Each
* member specifies primarily direction of lines (horizontal or vertical)
* and the direction of angle changes.
* Direction of angle changes is from multiples of 90 to odd multiples of 45.
* The image considered to be written top-down and left-to-right.
* Angles are started from vertical line and go clockwise.
* Separate quarters and halves are written in orientation they should be in
* full Hough space.
*/
/** enum cv::ximgproc::AngleRangeOption */
public static final int
  ARO_0_45    = 0, //< Vertical primarily direction and clockwise angle changes
  ARO_45_90   = 1, //< Horizontal primarily direction and counterclockwise angle changes
  ARO_90_135  = 2, //< Horizontal primarily direction and clockwise angle changes
  ARO_315_0   = 3, //< Vertical primarily direction and counterclockwise angle changes
  ARO_315_45  = 4, //< Vertical primarily direction
  ARO_45_135  = 5, //< Horizontal primarily direction
  ARO_315_135 = 6, //< Full set of directions
  ARO_CTR_HOR = 7, //< 90 +/- atan(0.5), interval approximately from 64.5 to 116.5 degrees.
                   //< It is used for calculating Fast Hough Transform for images skewed by atan(0.5).
  ARO_CTR_VER = 8;  //< +/- atan(0.5), interval approximately from 333.5(-26.5) to 26.5 degrees
                   //< It is used for calculating Fast Hough Transform for images skewed by atan(0.5).

/**
 * \brief   Specifies binary operations.
 * \details The enum specifies binary operations, that is such ones which involve
 *          two operands. Formally, a binary operation \f$ f \f$ on a set \f$ S \f$
 *          is a binary relation that maps elements of the Cartesian product
 *          \f$ S \times S \f$ to \f$ S \f$:
*           \f[ f: S \times S \to S \f]
 * \ingroup MinUtils_MathOper
 */
/** enum cv::ximgproc::HoughOp */
public static final int
  FHT_MIN = 0,  //< Binary minimum operation. The constant specifies the binary minimum operation
                //< @f$ f @f$ that is defined as follows: @f[ f(x, y) = \min(x, y) @f]
  FHT_MAX = 1,  //< Binary maximum operation. The constant specifies the binary maximum operation
                //< @f$ f @f$ that is defined as follows: @f[ f(x, y) = \max(x, y) @f]
  FHT_ADD = 2,  //< Binary addition operation. The constant specifies the binary addition operation
                //< @f$ f @f$ that is defined as follows: @f[ f(x, y) = x + y @f]
  FHT_AVE = 3;   //< Binary average operation. The constant specifies the binary average operation
                //< @f$ f @f$ that is defined as follows: @f[ f(x, y) = \frac{x + y}{2} @f]

/**
* \brief   Specifies to do or not to do skewing of Hough transform image
* \details The enum specifies to do or not to do skewing of Hough transform image
* so it would be no cycling in Hough transform image through borders of image.
*/
/** enum cv::ximgproc::HoughDeskewOption */
public static final int
  HDO_RAW    = 0, //< Use raw cyclic image
  HDO_DESKEW = 1;  //< Prepare deskewed image

/**
 * \brief   Specifies the degree of rules validation.
 * \details The enum specifies the degree of rules validation. This can be used,
 *          for example, to choose a proper way of input arguments validation.
 */
/** enum cv::ximgproc::RulesOption */
public static final int
  /** Validate each rule in a proper way. */
  RO_STRICT          =  0x00,
  /** Skip validations of image borders. */
  RO_IGNORE_BORDERS  =  0x01;

/**
* \brief   Calculates 2D Fast Hough transform of an image.
* @param   dst         The destination image, result of transformation.
* @param   src         The source (input) image.
* @param   dstMatDepth The depth of destination image
* @param   op          The operation to be applied, see cv::HoughOp
* @param   angleRange  The part of Hough space to calculate, see cv::AngleRangeOption
* @param   makeSkew    Specifies to do or not to do image skewing, see cv::HoughDeskewOption
*
* The function calculates the fast Hough transform for full, half or quarter
* range of angles.
*/
@Namespace("cv::ximgproc") public static native void FastHoughTransform( @ByVal Mat src,
                                    @ByVal Mat dst,
                                    int dstMatDepth,
                                    int angleRange/*=cv::ximgproc::ARO_315_135*/,
                                    int op/*=cv::ximgproc::FHT_ADD*/,
                                    int makeSkew/*=cv::ximgproc::HDO_DESKEW*/ );
@Namespace("cv::ximgproc") public static native void FastHoughTransform( @ByVal Mat src,
                                    @ByVal Mat dst,
                                    int dstMatDepth );

/**
* \brief   Calculates coordinates of line segment corresponded by point in Hough space.
* @param   houghPoint  Point in Hough space.
* @param   srcImgInfo The source (input) image of Hough transform.
* @param   angleRange  The part of Hough space where point is situated, see cv::AngleRangeOption
* @param   makeSkew    Specifies to do or not to do image skewing, see cv::HoughDeskewOption
* @param   rules       Specifies strictness of line segment calculating, see cv::RulesOption
* \retval  [Vec4i]     Coordinates of line segment corresponded by point in Hough space.
* \remarks If rules parameter set to RO_STRICT
           then returned line cut along the border of source image.
* \remarks If rules parameter set to RO_WEAK then in case of point, which belongs
           the incorrect part of Hough image, returned line will not intersect source image.
*
* The function calculates coordinates of line segment corresponded by point in Hough space.
*/
@Namespace("cv::ximgproc") public static native @ByVal Scalar4i HoughPoint2Line(@Const @ByRef Point houghPoint,
                                 @ByVal Mat srcImgInfo,
                                 int angleRange/*=cv::ximgproc::ARO_315_135*/,
                                 int makeSkew/*=cv::ximgproc::HDO_DESKEW*/,
                                 int rules/*=cv::ximgproc::RO_IGNORE_BORDERS*/ );
@Namespace("cv::ximgproc") public static native @ByVal Scalar4i HoughPoint2Line(@Const @ByRef Point houghPoint,
                                 @ByVal Mat srcImgInfo );

 // namespace cv::ximgproc

// #endif //__cplusplus
// #endif //__OPENCV_FAST_HOUGH_TRANSFORM_HPP__


// Parsed from opencv2/ximgproc/estimated_covariance.hpp

/*
By downloading, copying, installing or using the software you agree to this license.
If you do not agree to this license, do not download, install,
copy or use the software.


                          License Agreement
               For Open Source Computer Vision Library
                       (3-clause BSD License)

Copyright (C) 2000-2015, Intel Corporation, all rights reserved.
Copyright (C) 2009-2011, Willow Garage Inc., all rights reserved.
Copyright (C) 2009-2015, NVIDIA Corporation, all rights reserved.
Copyright (C) 2010-2013, Advanced Micro Devices, Inc., all rights reserved.
Copyright (C) 2015, OpenCV Foundation, all rights reserved.
Copyright (C) 2015, Itseez Inc., all rights reserved.
Third party copyrights are property of their respective owners.

Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:

  * Redistributions of source code must retain the above copyright notice,
    this list of conditions and the following disclaimer.

  * Redistributions in binary form must reproduce the above copyright notice,
    this list of conditions and the following disclaimer in the documentation
    and/or other materials provided with the distribution.

  * Neither the names of the copyright holders nor the names of the contributors
    may be used to endorse or promote products derived from this software
    without specific prior written permission.

This software is provided by the copyright holders and contributors "as is" and
any express or implied warranties, including, but not limited to, the implied
warranties of merchantability and fitness for a particular purpose are disclaimed.
In no event shall copyright holders or contributors be liable for any direct,
indirect, incidental, special, exemplary, or consequential damages
(including, but not limited to, procurement of substitute goods or services;
loss of use, data, or profits; or business interruption) however caused
and on any theory of liability, whether in contract, strict liability,
or tort (including negligence or otherwise) arising in any way out of
the use of this software, even if advised of the possibility of such damage.

Algorithmic details of this algorithm can be found at:
 * O. Green, Y. Birk, "A Computationally Efficient Algorithm for the 2D Covariance Method", ACM/IEEE International Conference on High Performance Computing, Networking, Storage and Analysis, Denver, Colorado, 2013
A previous and less efficient version of the algorithm can be found:
 * O. Green, L. David, A. Galperin, Y. Birk, "Efficient parallel computation of the estimated covariance matrix", arXiv, 2013


*/
// #ifndef __OPENCV_ESTIMATECOVARIANCE_HPP__
// #define __OPENCV_ESTIMATECOVARIANCE_HPP__
// #ifdef __cplusplus

// #include <opencv2/core.hpp>

/** \brief Computes the estimated covariance matrix of an image using the sliding
window forumlation.
<p>
@param src The source image. Input image must be of a complex type.
@param dst The destination estimated covariance matrix. Output matrix will be size (windowRows*windowCols, windowRows*windowCols).
@param windowRows The number of rows in the window.
@param windowCols The number of cols in the window.
The window size parameters control the accuracy of the estimation.
The sliding window moves over the entire image from the top-left corner
to the bottom right corner. Each location of the window represents a sample.
If the window is the size of the image, then this gives the exact covariance matrix.
For all other cases, the sizes of the window will impact the number of samples
and the number of elements in the estimated covariance matrix.
*/

@Namespace("cv::ximgproc") public static native void covarianceEstimation(@ByVal Mat src, @ByVal Mat dst, int windowRows, int windowCols);



// #endif
// #endif


// Parsed from opencv2/ximgproc/slic.hpp

/*********************************************************************
 * Software License Agreement (BSD License)
 *
 * Copyright (c) 2013
 * Radhakrishna Achanta
 * email : Radhakrishna [dot] Achanta [at] epfl [dot] ch
 * web : http://ivrl.epfl.ch/people/achanta
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions
 *  are met:
 *
 *   * Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *   * Redistributions in binary form must reproduce the above
 *     copyright notice, this list of conditions and the following
 *     disclaimer in the documentation and/or other materials provided
 *     with the distribution.
 *   * Neither the name of the copyright holders nor the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 *  "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 *  LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 *  FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 *  COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 *  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 *  BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 *  LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 *  CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 *  LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
 *  ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 *  POSSIBILITY OF SUCH DAMAGE.
 *********************************************************************/

/*
 "SLIC Superpixels Compared to State-of-the-art Superpixel Methods"
 Radhakrishna Achanta, Appu Shaji, Kevin Smith, Aurelien Lucchi, Pascal Fua,
 and Sabine Susstrunk, IEEE TPAMI, Volume 34, Issue 11, Pages 2274-2282,
 November 2012.

 "SLIC Superpixels" Radhakrishna Achanta, Appu Shaji, Kevin Smith,
 Aurelien Lucchi, Pascal Fua, and Sabine Süsstrunk, EPFL Technical
 Report no. 149300, June 2010.

 OpenCV port by: Cristian Balint <cristian dot balint at gmail dot com>
 */

// #ifndef __OPENCV_SLIC_HPP__
// #define __OPENCV_SLIC_HPP__
// #ifdef __cplusplus

// #include <opencv2/core.hpp>

/** \addtogroup ximgproc_superpixel
 *  \{
<p>
/** \brief Class implementing the SLIC (Simple Linear Iterative Clustering) superpixels
algorithm described in \cite Achanta2012.
<p>
SLIC (Simple Linear Iterative Clustering) clusters pixels using pixel channels and image plane space
to efficiently generate compact, nearly uniform superpixels. The simplicity of approach makes it
extremely easy to use a lone parameter specifies the number of superpixels and the efficiency of
the algorithm makes it very practical.
 <p>
 */

@Namespace("cv::ximgproc") public static class SuperpixelSLIC extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SuperpixelSLIC(Pointer p) { super(p); }


    /** \brief Calculates the actual amount of superpixels on a given segmentation computed
    and stored in SuperpixelSLIC object.
     */
    public native int getNumberOfSuperpixels();

    /** \brief Calculates the superpixel segmentation on a given image with the initialized
    parameters in the SuperpixelSLIC object.
    <p>
    This function can be called again without the need of initializing the algorithm with
    createSuperpixelSLIC(). This save the computational cost of allocating memory for all the
    structures of the algorithm.
    <p>
    @param num_iterations Number of iterations. Higher number improves the result.
    <p>
    The function computes the superpixels segmentation of an image with the parameters initialized
    with the function createSuperpixelSLIC(). The algorithms starts from a grid of superpixels and
    then refines the boundaries by proposing updates of edges boundaries.
     <p>
     */
    public native void iterate( int num_iterations/*=10*/ );
    public native void iterate( );

    /** \brief Returns the segmentation labeling of the image.
    <p>
    Each label represents a superpixel, and each pixel is assigned to one superpixel label.
    <p>
    @param labels_out Return: A CV_32SC1 integer array containing the labels of the superpixel
    segmentation. The labels are in the range [0, getNumberOfSuperpixels()].
    <p>
    The function returns an image with the labels of the superpixel segmentation. The labels are in
    the range [0, getNumberOfSuperpixels()].
     */
    public native void getLabels( @ByVal Mat labels_out );

    /** \brief Returns the mask of the superpixel segmentation stored in SuperpixelSLIC object.
    <p>
    @param image Return: CV_8U1 image mask where -1 indicates that the pixel is a superpixel border,
    and 0 otherwise.
    <p>
    @param thick_line If false, the border is only one pixel wide, otherwise all pixels at the border
    are masked.
    <p>
    The function return the boundaries of the superpixel segmentation.
     */
    public native void getLabelContourMask( @ByVal Mat image, @Cast("bool") boolean thick_line/*=true*/ );
    public native void getLabelContourMask( @ByVal Mat image );

    /** \brief Enforce label connectivity.
    <p>
    @param min_element_size The minimum element size in percents that should be absorbed into a bigger
    superpixel. Given resulted average superpixel size valid value should be in 0-100 range, 25 means
    that less then a quarter sized superpixel should be absorbed, this is default.
    <p>
    The function merge component that is too small, assigning the previously found adjacent label
    to this component. Calling this function may change the final number of superpixels.
     */
    public native void enforceLabelConnectivity( int min_element_size/*=25*/ );
    public native void enforceLabelConnectivity( );


}

/** \brief Class implementing the SLIC (Simple Linear Iterative Clustering) superpixels
<p>
@param image Image to segment
@param algorithm Chooses the algorithm variant to use:
SLIC segments image using a desired region_size, and in addition
SLICO will choose an adaptive compactness factor.
@param region_size Chooses an average superpixel size measured in pixels
@param ruler Chooses the enforcement of superpixel smoothness factor of superpixel
<p>
The function initializes a SuperpixelSLIC object for the input image. It sets the parameters of choosed
superpixel algorithm, which are: region_size and ruler. It preallocate some buffers for future
computing iterations over the given image. An example of SLIC versus SLICO is ilustrated in the
following picture.
<p>
![image](pics/slic_slico_kermit.png)
 <p>
 */

    /** enum cv::ximgproc::SLIC */
    public static final int SLIC = 100, SLICO = 101;

    @Namespace("cv::ximgproc") public static native @Ptr SuperpixelSLIC createSuperpixelSLIC( @ByVal Mat image, int algorithm/*=cv::ximgproc::SLICO*/,
                                                               int region_size/*=10*/, float ruler/*=10.0f*/ );
    @Namespace("cv::ximgproc") public static native @Ptr SuperpixelSLIC createSuperpixelSLIC( @ByVal Mat image );

/** \} */



// #endif
// #endif


// Parsed from opencv2/ximgproc/lsc.hpp

/*********************************************************************
 * Software License Agreement (BSD License)
 *
 * Copyright (c) 2014, 2015
 * Zhengqin Li <li-zq12 at mails dot tsinghua dot edu dot cn>
 * Jiansheng Chen <jschenthu at mail dot tsinghua dot edu dot cn>
 * Tsinghua University
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions
 *  are met:
 *
 *   * Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *   * Redistributions in binary form must reproduce the above
 *     copyright notice, this list of conditions and the following
 *     disclaimer in the documentation and/or other materials provided
 *     with the distribution.
 *   * Neither the name of the copyright holders nor the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 *  "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 *  LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 *  FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 *  COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 *  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 *  BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 *  LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 *  CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 *  LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
 *  ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 *  POSSIBILITY OF SUCH DAMAGE.
 *********************************************************************/

/*

 "Superpixel Segmentation using Linear Spectral Clustering"
 Zhengqin Li, Jiansheng Chen, IEEE Conference on Computer Vision and Pattern
 Recognition (CVPR), Jun. 2015

 OpenCV port by: Cristian Balint <cristian dot balint at gmail dot com>
 */

// #ifndef __OPENCV_LSC_HPP__
// #define __OPENCV_LSC_HPP__
// #ifdef __cplusplus

// #include <opencv2/core.hpp>

/** \addtogroup ximgproc_superpixel
 *  \{
<p>
/** \brief Class implementing the LSC (Linear Spectral Clustering) superpixels
algorithm described in \cite LiCVPR2015LSC.
<p>
LSC (Linear Spectral Clustering) produces compact and uniform superpixels with low
computational costs. Basically, a normalized cuts formulation of the superpixel
segmentation is adopted based on a similarity metric that measures the color
similarity and space proximity between image pixels. LSC is of linear computational
complexity and high memory efficiency and is able to preserve global properties of images
 <p>
 */

@Namespace("cv::ximgproc") public static class SuperpixelLSC extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SuperpixelLSC(Pointer p) { super(p); }


    /** \brief Calculates the actual amount of superpixels on a given segmentation computed
    and stored in SuperpixelLSC object.
     */
    public native int getNumberOfSuperpixels();

    /** \brief Calculates the superpixel segmentation on a given image with the initialized
    parameters in the SuperpixelLSC object.
    <p>
    This function can be called again without the need of initializing the algorithm with
    createSuperpixelLSC(). This save the computational cost of allocating memory for all the
    structures of the algorithm.
    <p>
    @param num_iterations Number of iterations. Higher number improves the result.
    <p>
    The function computes the superpixels segmentation of an image with the parameters initialized
    with the function createSuperpixelLSC(). The algorithms starts from a grid of superpixels and
    then refines the boundaries by proposing updates of edges boundaries.
     <p>
     */
    public native void iterate( int num_iterations/*=10*/ );
    public native void iterate( );

    /** \brief Returns the segmentation labeling of the image.
    <p>
    Each label represents a superpixel, and each pixel is assigned to one superpixel label.
    <p>
    @param labels_out Return: A CV_32SC1 integer array containing the labels of the superpixel
    segmentation. The labels are in the range [0, getNumberOfSuperpixels()].
    <p>
    The function returns an image with the labels of the superpixel segmentation. The labels are in
    the range [0, getNumberOfSuperpixels()].
     */
    public native void getLabels( @ByVal Mat labels_out );

    /** \brief Returns the mask of the superpixel segmentation stored in SuperpixelLSC object.
    <p>
    @param image Return: CV_8U1 image mask where -1 indicates that the pixel is a superpixel border,
    and 0 otherwise.
    <p>
    @param thick_line If false, the border is only one pixel wide, otherwise all pixels at the border
    are masked.
    <p>
    The function return the boundaries of the superpixel segmentation.
     */
    public native void getLabelContourMask( @ByVal Mat image, @Cast("bool") boolean thick_line/*=true*/ );
    public native void getLabelContourMask( @ByVal Mat image );

    /** \brief Enforce label connectivity.
    <p>
    @param min_element_size The minimum element size in percents that should be absorbed into a bigger
    superpixel. Given resulted average superpixel size valid value should be in 0-100 range, 25 means
    that less then a quarter sized superpixel should be absorbed, this is default.
    <p>
    The function merge component that is too small, assigning the previously found adjacent label
    to this component. Calling this function may change the final number of superpixels.
     */
    public native void enforceLabelConnectivity( int min_element_size/*=20*/ );
    public native void enforceLabelConnectivity( );


}

/** \brief Class implementing the LSC (Linear Spectral Clustering) superpixels
<p>
@param image Image to segment
@param region_size Chooses an average superpixel size measured in pixels
@param ratio Chooses the enforcement of superpixel compactness factor of superpixel
<p>
The function initializes a SuperpixelLSC object for the input image. It sets the parameters of
superpixel algorithm, which are: region_size and ruler. It preallocate some buffers for future
computing iterations over the given image. An example of LSC is ilustrated in the following picture.
For enanched results it is recommended for color images to preprocess image with little gaussian blur
with a small 3 x 3 kernel and additional conversion into CieLAB color space.
<p>
![image](pics/superpixels_lsc.png)
 <p>
 */

    @Namespace("cv::ximgproc") public static native @Ptr SuperpixelLSC createSuperpixelLSC( @ByVal Mat image, int region_size/*=10*/, float ratio/*=0.075f*/ );
    @Namespace("cv::ximgproc") public static native @Ptr SuperpixelLSC createSuperpixelLSC( @ByVal Mat image );

/** \} */



// #endif
// #endif


}
